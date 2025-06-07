package org.library.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

@Schema(description = "Пост")
public record PostRequest(
        Long id,
        Integer userId,

        @Size(max = 100)
        @Schema(description = "Автор поста")
        Integer bookId,
        String text,
        String creationDate
) {
}
