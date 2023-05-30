package com.example.homework2.mapper;

import com.example.homework2.dto.UserDTO;
import com.example.homework2.dto.UserSaveRequest;
import com.example.homework2.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author ahmet
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User convertToUser(UserSaveRequest userSaveRequest);

    UserDTO convertToDTO(User user);

    List<UserDTO> convertToDTOList(List<User> userList);
}
