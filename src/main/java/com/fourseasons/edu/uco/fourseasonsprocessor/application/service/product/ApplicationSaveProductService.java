package com.fourseasons.edu.uco.fourseasonsprocessor.application.service.product;

import com.fourseasons.edu.uco.fourseasonsprocessor.application.dto.ProductDTO;
import com.fourseasons.edu.uco.fourseasonsprocessor.application.mapper.ApplicationProductMapper;
import com.fourseasons.edu.uco.fourseasonsprocessor.domain.model.Product;
import com.fourseasons.edu.uco.fourseasonsprocessor.infrastructure.adapter.repository.service.product.ProductSaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicationSaveProductService {

    private final ProductSaveService productSaveService;
    private final ApplicationProductMapper productMapper;
    public ProductDTO execute(ProductDTO productDTO) {
        Product product = productSaveService.execute(productMapper.toDomain(productDTO));
        return productMapper.toDto(product);
    }

}
