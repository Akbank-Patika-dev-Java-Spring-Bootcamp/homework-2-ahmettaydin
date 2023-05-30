package com.example.homework2.controller;

import com.example.homework2.controller.contract.UserControllerContract;
import com.example.homework2.dto.UserDTO;
import com.example.homework2.dto.UserSaveRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ahmet
 */
@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserControllerContract userControllerContract;

    @PostMapping
    public UserDTO save(@RequestBody UserSaveRequest userSaveRequest) {
        return userControllerContract.save(userSaveRequest);
    }

    @GetMapping("/{id}")
    public UserDTO findById(@PathVariable Long id) {
        return userControllerContract.findById(id);
    }

    @GetMapping
    public List<UserDTO> findAll() {
        return userControllerContract.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userControllerContract.delete(id);
    }

}
