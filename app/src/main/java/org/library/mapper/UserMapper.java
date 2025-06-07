package org.library.mapper;

import org.library.dto.request.UserRequest;
import org.library.dto.response.UserResponse;
import org.library.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.web.bind.annotation.ControllerAdvice;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;
import static org.mapstruct.ReportingPolicy.ERROR;

@ControllerAdvice
@Mapper(componentModel = SPRING, unmappedTargetPolicy = ERROR)
public interface UserMapper {
    UserResponse toResponse(User user);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "roleId", constant = "2L")
    User toEntity(UserRequest request);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "roleId", ignore = true)
    User updateEntity(@MappingTarget User user, UserRequest request);
}
