package sanity.nil.order.presentation.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sanity.nil.order.application.order.dto.CreateOrderDTO;
import sanity.nil.order.application.order.dto.OrderCreatedDTO;
import sanity.nil.order.application.order.interfaces.interactors.CreateOrderInteractor;

@RestController
@RequestMapping("/api/v1/order")
@RequiredArgsConstructor
public class OrderController {

    private final CreateOrderInteractor createOrderInteractor;

    @PostMapping
    public ResponseEntity<OrderCreatedDTO> create(@RequestBody CreateOrderDTO createOrderDTO) {
        return ResponseEntity
                .status(201)
                .body(createOrderInteractor.create(createOrderDTO));
    }
}
