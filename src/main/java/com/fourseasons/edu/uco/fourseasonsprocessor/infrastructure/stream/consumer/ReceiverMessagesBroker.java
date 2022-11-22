package com.fourseasons.edu.uco.fourseasonsprocessor.infrastructure.stream.consumer;


import com.fourseasons.edu.uco.fourseasonsprocessor.application.dto.ProductDTO;
import com.fourseasons.edu.uco.fourseasonsprocessor.application.service.product.ApplicationSaveProductService;
import com.fourseasons.edu.uco.fourseasonsprocessor.infrastructure.util.gson.MapperJsonObjeto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class ReceiverMessagesBroker {

    private final MapperJsonObjeto mapperJsonObjeto;

    private final ApplicationSaveProductService saveProductService;

    public ReceiverMessagesBroker(MapperJsonObjeto mapperJsonObjeto, ApplicationSaveProductService saveProductService) {
        this.mapperJsonObjeto = mapperJsonObjeto;
        this.saveProductService = saveProductService;
    }

    @RabbitListener(queues = "${client.queue-recibir.cliente.queue-name}")
    public void receiveMessageProcessClient(String message) {
        log.debug("mensaje recibido: {}", message);
    }

    private ProductDTO obtenerObjetoDeMensaje(String mensaje) {
        log.info("obtener objeto mensaje");
        ProductDTO productDTO = mapperJsonObjeto.ejecutar(mensaje, ProductDTO.class).get();
        saveProductService.execute(productDTO);
        return productDTO;
    }


}
