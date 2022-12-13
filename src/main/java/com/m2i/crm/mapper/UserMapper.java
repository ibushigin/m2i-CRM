package com.m2i.crm.mapper;

import com.m2i.crm.api.dto.UserDto;
import com.m2i.crm.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;


@Component
@Mapper( componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserMapper {
    @Mapping(target = "password", ignore = true)
    UserDto mapUserToUserDto(User user);
    User mapUserDtoToUser(UserDto user);
}
