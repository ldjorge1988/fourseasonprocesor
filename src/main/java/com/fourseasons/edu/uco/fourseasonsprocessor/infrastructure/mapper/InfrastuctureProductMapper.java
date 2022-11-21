package com.fourseasons.edu.uco.fourseasonsprocessor.infrastructure.mapper;

import com.fourseasons.edu.uco.fourseasonsprocessor.domain.model.Product;
import com.fourseasons.edu.uco.fourseasonsprocessor.infrastructure.adapter.entity.ProductEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface InfrastuctureProductMapper extends InfrastructureEntityMapper<ProductEntity, Product>{

}
