package com.example.homework2.controller.contract.impl;

import com.example.homework2.controller.contract.CommentControllerContract;
import com.example.homework2.dto.CommentDTO;
import com.example.homework2.dto.CommentSaveRequest;
import com.example.homework2.entity.Comment;
import com.example.homework2.mapper.CommentMapper;
import com.example.homework2.service.entityservice.CommentEntityService;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * @author ahmet
 */
@RequiredArgsConstructor
public class CommentControllerContractImpl implements CommentControllerContract {

    private final CommentEntityService commentEntityService;

    @Override
    public CommentDTO save(CommentSaveRequest commentSaveRequest) {
        Comment comment = CommentMapper.INSTANCE.convertToComment(commentSaveRequest);
        comment = commentEntityService.save(comment);
        CommentDTO commentDTO = CommentMapper.INSTANCE.convertToDTO(comment);
        return commentDTO;
    }

    @Override
    public List<CommentDTO> findByUserId(Long id) {

        return null;
    }

    @Override
    public List<CommentDTO> findByProductId(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
