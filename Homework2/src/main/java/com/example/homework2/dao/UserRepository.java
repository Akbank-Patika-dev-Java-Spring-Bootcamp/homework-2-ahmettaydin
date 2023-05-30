package com.example.homework2.dao;

import com.example.homework2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ahmet
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
