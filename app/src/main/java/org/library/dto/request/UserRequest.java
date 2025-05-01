package org.library.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Пользователь")
public record UserRequest(
        String username,
        @Schema(description = "Эл. Почта")
        String email,
        String password,
        String description
) {
}
