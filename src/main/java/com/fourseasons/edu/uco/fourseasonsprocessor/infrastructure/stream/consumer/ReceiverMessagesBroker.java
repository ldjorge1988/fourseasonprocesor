package com.fourseasons.edu.uco.fourseasonsprocessor.infrastructure.stream.consumer;


import com.fourseasons.edu.uco.fourseasonsprocessor.application.dto.ProductDTO;
import com.fourseasons.edu.uco.fourseasonsprocessor.infrastructure.util.gson.MapperJsonObjeto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Slf4j
@Component
public class ReceiverMessagesBroker {

    private final MapperJsonObjeto mapperJsonObjeto;

    public ReceiverMessagesBroker(MapperJsonObjeto mapperJsonObjeto) {
        this.mapperJsonObjeto = mapperJsonObjeto;
    }


    @RabbitListener(queues = "${client.queue-recibir.cliente.queue-name}")
    public void receiveMessageProcessClient(String message) {
        log.debug("mensaje recibido: {}", message);
    }

    private Optional<ProductDTO> obtenerObjetoDeMensaje(String mensaje) {
        log.info("obtener objeto mensaje");
        return mapperJsonObjeto.ejecutar(mensaje, ProductDTO.class);
    }


}
