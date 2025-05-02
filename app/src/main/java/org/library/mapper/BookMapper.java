package org.library.mapper;

import org.library.dto.request.BookRequest;
import org.library.dto.response.BookResponse;
import org.library.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;
import static org.mapstruct.ReportingPolicy.ERROR;

@Mapper(componentModel = SPRING, unmappedTargetPolicy = ERROR)
public interface BookMapper {
    BookResponse toResponse(Boook book);

    @Mapping(target = "id", ignore = true)
    Book toEntity(BookRequest request);
}
