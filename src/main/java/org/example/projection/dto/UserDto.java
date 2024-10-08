package org.example.projection.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.example.domain.user.User;

@Getter
@Builder
@AllArgsConstructor
public class UserDto {
    private String username;

    public static UserDto fromDomain(User user) {
        return UserDto.builder().username(user.getUsername()).build();
    }
}