package com.example.homework2.dto;

/**
 * @author ahmet
 */
public record CommentDTO(Long id,
                         Long productId,
                         Long userId,
                         String comment) {
}
