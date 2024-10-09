package org.example.port.service;

import org.example.projection.dto.IdentityDto;

import java.util.Optional;

public interface IdentityService {
    public Optional<IdentityDto> getUserByAuthToken(String authToken);

}
