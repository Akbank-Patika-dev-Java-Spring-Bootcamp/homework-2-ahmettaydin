package com.example.homework2.dao;

import com.example.homework2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ahmet
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

}
