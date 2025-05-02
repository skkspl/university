package org.library.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Книга")
public record BookRequest(
        String title,
        @Schema(description = "Название")
        String author,
        String description,
        String isbn,
        String coverImage,
        String content
) {
}
