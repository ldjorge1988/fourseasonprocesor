package com.fourseasons.edu.uco.fourseasonsprocessor.domain.port;

import com.fourseasons.edu.uco.fourseasonsprocessor.domain.model.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> getAll();


}
