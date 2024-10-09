package org.example.adapter.service;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.example.port.service.IdentityService;
import org.example.projection.dto.IdentityDto;
import org.springframework.stereotype.Service;
import sh.ory.kratos.ApiException;
import sh.ory.kratos.api.FrontendApi;
import sh.ory.kratos.model.Session;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.Map;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class IdentityServiceImpl implements IdentityService {
    private final FrontendApi kratosFrontendApi;
    @SneakyThrows
    public Optional<IdentityDto> getUserByAuthToken(String authToken)  {
        Session session;
        try {
            session = kratosFrontendApi.toSession(authToken, null, null);
        } catch (ApiException e) {
            if (e.getCode() == Response.Status.UNAUTHORIZED.getStatusCode()) {
                return Optional.empty();
            }
            throw new IOException(e);
        }

        if (session == null || session.getActive() == null || !session.getActive()) {
            return Optional.empty();
        }

        return Optional.of(getIdentity(session));
    }

    @SneakyThrows
    private IdentityDto getIdentity(Session session) {
        Map<String, Object> traits = (Map<String, Object>) session.getIdentity().getTraits();

        if (traits == null) {
            throw new Exception("get traits");
        }

        String email = (String) traits.get("email");
        if (email == null) {
            throw new Exception("get email");
        }

        return new IdentityDto(session.getIdentity().getId(), email, null);
    }
}
