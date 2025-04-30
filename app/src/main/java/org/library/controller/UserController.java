package org.library.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.library.dto.request.UserRequest;
import org.library.dto.response.UserResponse;
import org.library.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserService userService;

    @Operation(summary = "Создание пользователя")
    @PostMapping
    public UserResponse create(@RequestBody UserRequest request){
        return userService.createUser(request);
    }

    @GetMapping(path = "/{email}")
    public UserResponse getByEmail(@PathVariable String email){
        return userService.getUserByEmail(email);
    }
}
