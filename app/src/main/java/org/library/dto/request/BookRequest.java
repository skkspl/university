package org.library.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

@Schema(description = "Книга")
public record BookRequest(
        String title,
        @Size(max = 255)
        @Schema(description = "Название")
        String author,
        String description,
        String isbn,
        String content
) {
}
