package org.library.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

@Schema(description = "Пост")
public record PostRequest(
        @Schema(description = "Автор поста")
        Long userId,
        Long bookId,
        @Size(max = 100)
        String text
) {
}
