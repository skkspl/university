package org.library.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

@Schema
public record UserRegisterRequest(
        @NotEmpty(message = "Email не должен быть пустым")
        @Email(message = "Некорректный формат email")
        String email,

        @NotEmpty(message = "Пароль не должен быть пустым")
        @Schema(description = "Пароль – используется только для регистрации")
        String password,

        @NotEmpty(message = "Имя пользователя не должно быть пустым")
        String username,

        String aboutMe
) {
}
