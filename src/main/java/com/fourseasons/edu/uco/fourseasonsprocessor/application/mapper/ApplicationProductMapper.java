package com.fourseasons.edu.uco.fourseasonsprocessor.application.mapper;

import com.fourseasons.edu.uco.fourseasonsprocessor.application.dto.ProductDTO;
import com.fourseasons.edu.uco.fourseasonsprocessor.domain.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface ApplicationProductMapper extends ApplicationEntityMapper<ProductDTO, Product> {

}
