package com.example.homework2.controller;

import com.example.homework2.controller.contract.ProductControllerContract;
import com.example.homework2.dto.ProductDTO;
import com.example.homework2.dto.ProductSaveRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ahmet
 */
@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductControllerContract productControllerContract;

    @PostMapping
    public ProductDTO save(@RequestBody ProductSaveRequest productSaveRequest) {
        return productControllerContract.save(productSaveRequest);
    }

    @GetMapping("/{id}")
    public ProductDTO findById(@PathVariable Long id){
        return productControllerContract.findById(id);
    }

    @GetMapping
    public List<ProductDTO> findAll() {
        return productControllerContract.findAll();
    }

    @PutMapping("/{id}/price")
    public ProductDTO updateByPrice(@PathVariable Long id, @RequestBody double price) {
        return productControllerContract.updateByPrice(id, price);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productControllerContract.delete(id);
    }
}
