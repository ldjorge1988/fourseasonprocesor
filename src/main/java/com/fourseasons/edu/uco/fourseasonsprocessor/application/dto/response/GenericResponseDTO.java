package com.fourseasons.edu.uco.fourseasonsprocessor.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GenericResponseDTO<T> implements Serializable {

    private static final long serialVersionUID = 2150687141828922398L;
    private T data;

}
