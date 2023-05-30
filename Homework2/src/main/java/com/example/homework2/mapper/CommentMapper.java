package com.example.homework2.mapper;

import com.example.homework2.dto.CommentDTO;
import com.example.homework2.dto.CommentSaveRequest;
import com.example.homework2.entity.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author ahmet
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CommentMapper {

    CommentMapper INSTANCE = Mappers.getMapper(CommentMapper.class);

    Comment convertToComment(CommentSaveRequest commentSaveRequest);

    CommentDTO convertToDTO(Comment comment);

    List<CommentDTO> convertToDTOList(List<Comment> commentList);
}
