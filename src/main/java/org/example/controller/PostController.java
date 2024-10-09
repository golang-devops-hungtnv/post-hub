package org.example.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.example.port.facade.PostFacade;
import org.example.port.facade.UserFacade;
import org.example.projection.dto.UserDto;
import org.example.projection.response.BaseResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/user/post")
@RestController
@RequiredArgsConstructor
public class PostController {
//    private final PostFacade postFacade;
//    @GetMapping
//    @Operation(tags = {"Post APIs"})
//    @ResponseStatus(HttpStatus.OK)
//    BaseResponse<List<UserDto>> getUsers() {
//        return BaseResponse.of(this.userFacade.getUsers());
//    }
}