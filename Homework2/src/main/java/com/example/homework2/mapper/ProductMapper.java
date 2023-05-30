package com.example.homework2.mapper;

import com.example.homework2.dto.ProductDTO;
import com.example.homework2.dto.ProductSaveRequest;
import com.example.homework2.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author ahmet
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    Product converToProduct(ProductSaveRequest productSaveRequest);

    ProductDTO convertToDTO(Product product);

    List<ProductDTO> convertToDTOList(List<Product> productList);

}
