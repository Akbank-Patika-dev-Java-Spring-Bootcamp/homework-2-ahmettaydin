package com.example.homework2.dao;

import com.example.homework2.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ahmet
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
