package com.example.homework2.dto;

/**
 * @author ahmet
 */
public record UserDTO(Long id,
                      String name,
                      String surname,
                      String username,
                      String email,
                      String phoneNumber) {
}
