package org.example.adapter.facade;

import java.util.Collections;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.example.port.facade.UserFacade;
import org.example.port.repository.UserRepository;
import org.example.projection.dto.UserDto;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;


@Service
@RequiredArgsConstructor
public class UserFacadeImpl implements UserFacade {
    private final UserRepository userRepository;

    @Override
    public List<UserDto> getUsers() {
        var users = this.userRepository.findAll();
        if (CollectionUtils.isEmpty(users)) return Collections.emptyList();

        return users.stream().map(UserDto::fromDomain).toList();
    }
}