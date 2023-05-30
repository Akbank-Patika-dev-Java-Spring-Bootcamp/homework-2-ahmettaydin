package com.example.homework2.controller.contract.impl;

import com.example.homework2.controller.contract.UserControllerContract;
import com.example.homework2.dto.UserDTO;
import com.example.homework2.dto.UserSaveRequest;
import com.example.homework2.entity.User;
import com.example.homework2.mapper.UserMapper;
import com.example.homework2.service.entityservice.UserEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author ahmet
 */
@Service
@RequiredArgsConstructor
public class UserControllerContractImpl implements UserControllerContract {

    private final UserEntityService userEntityService;


    @Override
    public UserDTO save(UserSaveRequest userSaveRequest) {
        User user = UserMapper.INSTANCE.convertToUser(userSaveRequest);
        user = userEntityService.save(user);
        UserDTO userDTO = UserMapper.INSTANCE.convertToDTO(user);
        return userDTO;
    }

    @Override
    public UserDTO findById(Long id) {
        User user = userEntityService.findByIdWithControl(id);
        UserDTO userDTO = UserMapper.INSTANCE.convertToDTO(user);
        return userDTO;
    }

    @Override
    public List<UserDTO> findAll() {
        List<User> userList = userEntityService.findAll();
        List<UserDTO> userDTOList = UserMapper.INSTANCE.convertToDTOList(userList);
        return userDTOList;
    }

    @Override
    public void delete(Long id) {
        userEntityService.delete(id);
    }
}
