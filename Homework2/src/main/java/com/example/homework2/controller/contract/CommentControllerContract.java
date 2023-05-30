package com.example.homework2.controller.contract;

import com.example.homework2.dto.CommentDTO;
import com.example.homework2.dto.CommentSaveRequest;

import java.util.List;

/**
 * @author ahmet
 */
public interface CommentControllerContract {

    CommentDTO save(CommentSaveRequest commentSaveRequest);

    List<CommentDTO> findByUserId(Long id);

    List<CommentDTO> findByProductId(Long id);

    void delete(Long id);
}
