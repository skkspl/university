package org.library.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.library.dto.request.UserLoginRequest;
import org.library.dto.request.UserRegisterRequest;
import org.library.dto.response.JwtAuthResponse;
import org.library.service.AuthService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/login")
    public JwtAuthResponse login(@RequestBody @Valid UserLoginRequest request) {
        return authService.login(request);
    }

    @PostMapping("/register")
    public JwtAuthResponse register(@RequestBody @Valid UserRegisterRequest request) {
        return authService.register(request);
    }
}
