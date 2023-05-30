package com.example.homework2.service.entityservice;

import com.example.homework2.base.BaseEntityService;
import com.example.homework2.dao.CommentRepository;
import com.example.homework2.entity.Comment;
import org.springframework.stereotype.Service;

/**
 * @author ahmet
 */
@Service
public class CommentEntityService extends BaseEntityService<Comment, CommentRepository> {

    public CommentEntityService(CommentRepository repository) {
        super(repository);
    }
}
