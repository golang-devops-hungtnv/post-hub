package org.example.port.facade;

import org.example.projection.dto.UserDto;

import java.util.List;

public interface UserFacade {
    List<UserDto> getUsers();
}