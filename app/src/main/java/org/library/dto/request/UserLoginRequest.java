package org.library.dto.request;

public record UserLoginRequest(
        String email,
        String password
) {
}
