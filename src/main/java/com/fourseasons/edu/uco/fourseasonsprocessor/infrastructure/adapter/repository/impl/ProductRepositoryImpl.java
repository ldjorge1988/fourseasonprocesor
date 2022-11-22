package com.fourseasons.edu.uco.fourseasonsprocessor.infrastructure.adapter.repository.impl;

import com.fourseasons.edu.uco.fourseasonsprocessor.domain.model.Product;
import com.fourseasons.edu.uco.fourseasonsprocessor.domain.port.ProductRepository;
import com.fourseasons.edu.uco.fourseasonsprocessor.infrastructure.adapter.entity.ProductEntity;
import com.fourseasons.edu.uco.fourseasonsprocessor.infrastructure.adapter.repository.jpa.ProductRepositoryJpa;
import com.fourseasons.edu.uco.fourseasonsprocessor.infrastructure.mapper.InfrastuctureProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private final ProductRepositoryJpa productRepositoryJpa;
    private final InfrastuctureProductMapper productMapper;

    @Override
    public List<Product> getAll() {
        List<ProductEntity> productEntities = productRepositoryJpa.findAll();
        return productMapper.toDomains(productEntities);
    }

    @Override
    public Product save(Product product) {
        ProductEntity productEntity = productMapper.toEntity(product);
        return productMapper.toDomain(productRepositoryJpa.save(productEntity));
    }
}
