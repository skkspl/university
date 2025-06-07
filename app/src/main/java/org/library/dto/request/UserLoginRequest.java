package org.library.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public record UserLoginRequest(
        @NotEmpty(message = "Email не должен быть пустым")
        @Email(message = "Некорректный формат email")
        String email,

        @NotEmpty(message = "Пароль не должен быть пустым")
        @Schema(accessMode = Schema.AccessMode.WRITE_ONLY, description = "Пароль – используется только для аутентификации")
        String password
) {
}
