package com.fourseasons.edu.uco.fourseasonsprocessor.infrastructure.adapter.repository.service.product;

import com.fourseasons.edu.uco.fourseasonsprocessor.domain.model.Product;
import com.fourseasons.edu.uco.fourseasonsprocessor.domain.port.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductSaveService {

    private final ProductRepository repository;

    public Product execute(Product product) {
        return repository.save(product);
    }

}
