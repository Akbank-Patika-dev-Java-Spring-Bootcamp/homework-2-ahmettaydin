package com.example.homework2.service.entityservice;

import com.example.homework2.base.BaseEntityService;
import com.example.homework2.dao.ProductRepository;
import com.example.homework2.entity.Product;
import org.springframework.stereotype.Service;

/**
 * @author ahmet
 */
@Service
public class ProductEntityService extends BaseEntityService<Product, ProductRepository> {

    public ProductEntityService(ProductRepository repository) {
        super(repository);
    }

}
