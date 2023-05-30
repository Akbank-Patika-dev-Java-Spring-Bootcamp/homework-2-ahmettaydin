package com.example.homework2.controller.contract;

import com.example.homework2.dto.ProductDTO;
import com.example.homework2.dto.ProductSaveRequest;

import java.util.List;

/**
 * @author ahmet
 */
public interface ProductControllerContract {

    ProductDTO save(ProductSaveRequest productSaveRequest);

    ProductDTO findById(Long id);

    List<ProductDTO> findAll();

    ProductDTO updateByPrice(Long id, double price);

    void delete(Long id);
}
