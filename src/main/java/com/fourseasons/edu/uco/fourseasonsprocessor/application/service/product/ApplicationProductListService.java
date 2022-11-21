package com.fourseasons.edu.uco.fourseasonsprocessor.application.service.product;

import com.fourseasons.edu.uco.fourseasonsprocessor.application.dto.response.GenericResponseDTO;
import com.fourseasons.edu.uco.fourseasonsprocessor.application.mapper.ApplicationProductMapper;
import com.fourseasons.edu.uco.fourseasonsprocessor.domain.port.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicationProductListService {
    private final ProductRepository repository;
    private final ApplicationProductMapper mapper;
    public GenericResponseDTO execute() {
        return GenericResponseDTO.builder()
                .data(mapper.toDtos(repository.getAll()))
                .build();
    }
}
