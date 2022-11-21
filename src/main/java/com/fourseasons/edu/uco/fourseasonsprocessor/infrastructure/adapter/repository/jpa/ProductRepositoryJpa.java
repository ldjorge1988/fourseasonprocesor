package com.fourseasons.edu.uco.fourseasonsprocessor.infrastructure.adapter.repository.jpa;

import com.fourseasons.edu.uco.fourseasonsprocessor.infrastructure.adapter.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositoryJpa extends JpaRepository<ProductEntity, Long> {

}
