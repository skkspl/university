package org.library.dto.response;

public record BookResponse(
        Long id,
        String title,
        String author,
        String description,
        String isbn,
        String coverImage,
        String content
) {
}