package org.example.projection.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class IdentityDto {
    private String Id;
    private String Email;
    private String Password;
}
