package com.example.homework2.dto;

/**
 * @author ahmet
 */
public record UserSaveRequest(String name,
                              String surname,
                              String username,
                              String password,
                              String email,
                              String phoneNumber) {
}
