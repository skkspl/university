package org.library.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

import static io.swagger.v3.oas.annotations.media.Schema.RequiredMode.REQUIRED;

@Schema(description = "Пользователь")
public record UserRequest(
        @Size(max = 255)
        @Schema(description = "Имя пользователя", examples = "Вася", requiredMode = REQUIRED)
        String username,
        @Email
        @Size(max = 255)
        @Schema(description = "Эл. Почта", examples = "vasya@mail.ru", requiredMode = REQUIRED)
        String email,
        @Size(max = 255)
        @Schema(description = "Пароль", examples = "password", requiredMode = REQUIRED)
        String password,
        @Schema(description = "О себе", examples = "Люблю пельмени")
        String aboutMe
) {
}
