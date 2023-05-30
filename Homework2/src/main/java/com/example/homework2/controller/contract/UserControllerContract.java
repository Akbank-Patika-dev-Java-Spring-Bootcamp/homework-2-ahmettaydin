package com.example.homework2.controller.contract;

import com.example.homework2.dto.UserDTO;
import com.example.homework2.dto.UserSaveRequest;

import java.util.List;

/**
 * @author ahmet
 */
public interface UserControllerContract {
    UserDTO save(UserSaveRequest userSaveRequest);

    UserDTO findById(Long id);

    List<UserDTO> findAll();

    void delete(Long id);
}
