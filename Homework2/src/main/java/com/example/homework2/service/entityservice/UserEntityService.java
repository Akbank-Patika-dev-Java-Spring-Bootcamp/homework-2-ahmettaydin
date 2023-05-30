package com.example.homework2.service.entityservice;

import com.example.homework2.base.BaseEntityService;
import com.example.homework2.dao.UserRepository;
import com.example.homework2.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author ahmet
 */
@Service
public class UserEntityService extends BaseEntityService<User, UserRepository> {

    public UserEntityService(UserRepository repository) {
        super(repository);
    }
}
