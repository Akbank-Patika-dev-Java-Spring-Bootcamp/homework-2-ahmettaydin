package com.example.homework2.dto;

/**
 * @author ahmet
 */
public record CommentSaveRequest(Long productId,
                                 Long userId,
                                 String comment) {
}
