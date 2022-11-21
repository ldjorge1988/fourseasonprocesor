package com.fourseasons.edu.uco.fourseasonsprocessor.infrastructure.controller;

import com.fourseasons.edu.uco.fourseasonsprocessor.application.dto.response.GenericResponseDTO;
import com.fourseasons.edu.uco.fourseasonsprocessor.application.service.product.ApplicationProductListService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequiredArgsConstructor
@RequestMapping("/inventory")
public class ProductController {

    private final ApplicationProductListService productListService;

    @GetMapping("/products")
    public ResponseEntity<GenericResponseDTO> getAllProducts() {
        return ok(productListService.execute());
    }

}
