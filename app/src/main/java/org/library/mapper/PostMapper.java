package org.library.mapper;

import org.library.dto.request.PostRequest;
import org.library.dto.response.PostResponse;
import org.library.entity.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;
import static org.mapstruct.ReportingPolicy.ERROR;

@Mapper(componentModel = SPRING, unmappedTargetPolicy = ERROR)
public interface PostMapper {

    PostResponse toResponse(Post post);

    @Mapping(target = "id", ignore = true)
    Post toEntity(PostRequest request);

    @Mapping(target = "id", ignore = true)
    void updateEntityFromDto(@MappingTarget Post post, PostRequest request);
}
