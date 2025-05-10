package org.library.mapper;

import org.library.dto.request.BookRequest;
import org.library.dto.response.BookResponse;
import org.library.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;
import static org.mapstruct.ReportingPolicy.ERROR;

@Mapper(componentModel = SPRING, unmappedTargetPolicy = ERROR)
public interface BookMapper {

    BookResponse toResponse(Book book);

    @Mapping(target = "id", ignore = true)
    Book toEntity(BookRequest request);

    @Mapping(target = "id", ignore = true)
    void updateEntityFromDto(@MappingTarget Book book, BookRequest request);
}
