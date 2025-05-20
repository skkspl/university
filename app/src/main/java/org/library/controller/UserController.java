package org.library.controller;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.library.dto.request.UserRequest;
import org.library.dto.response.PostResponse;
import org.library.dto.response.UserResponse;
import org.library.service.UserService;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserService userService;

    @Operation(summary = "Создание пользователя")
    @PostMapping
    public UserResponse create(@RequestBody @Valid UserRequest request) {
        return userService.createUser(request);
    }

    @PutMapping(path = "/{id}")
    public UserResponse update(@PathVariable Long id, @RequestBody @Valid UserRequest request) {
        return userService.updateUser(id, request);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @GetMapping("/{id}")
    public UserResponse getById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping(path = "/{email}")
    public UserResponse getByEmail(@PathVariable String email) {
        return userService.getUserByEmail(email);
    }

    @GetMapping
    public Page<UserResponse> getAllUsers(@ParameterObject @PageableDefault(sort = "email") Pageable pageable) {
        return userService.getAllUsers(pageable);
    }
}
