package org.library.dto.response;

public record PostResponse(
        Long id,
        Integer userId,
        Integer bookId,
        String text,
        String creationDate
) {
}