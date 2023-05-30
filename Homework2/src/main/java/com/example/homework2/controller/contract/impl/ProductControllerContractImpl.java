package com.example.homework2.controller.contract.impl;

import com.example.homework2.controller.contract.ProductControllerContract;
import com.example.homework2.dto.ProductDTO;
import com.example.homework2.dto.ProductSaveRequest;
import com.example.homework2.entity.Product;
import com.example.homework2.mapper.ProductMapper;
import com.example.homework2.service.entityservice.ProductEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author ahmet
 */
@Service
@RequiredArgsConstructor
public class ProductControllerContractImpl implements ProductControllerContract {

    private final ProductEntityService productEntityService;

    @Override
    public ProductDTO save(ProductSaveRequest productSaveRequest) {
        Product product = ProductMapper.INSTANCE.converToProduct(productSaveRequest);
        product = productEntityService.save(product);
        ProductDTO productDTO = ProductMapper.INSTANCE.convertToDTO(product);

        return productDTO;
    }

    @Override
    public ProductDTO findById(Long id) {
        Product product = productEntityService.findByIdWithControl(id);
        ProductDTO productDTO = ProductMapper.INSTANCE.convertToDTO(product);
        return productDTO;
    }

    @Override
    public List<ProductDTO> findAll() {
        List<Product> productList = productEntityService.findAll();
        List<ProductDTO> productDTOList = ProductMapper.INSTANCE.convertToDTOList(productList);

        return productDTOList;
    }

    @Override
    public ProductDTO updateByPrice(Long id, double price) {
        Product product = productEntityService.findByIdWithControl(id);
        product.setPrice(price);
        product = productEntityService.save(product);
        ProductDTO productDTO = ProductMapper.INSTANCE.convertToDTO(product);
        return productDTO;
    }

    @Override
    public void delete(Long id) {
        productEntityService.delete(id);
    }
}
