package com.hrpayroll.hrpayroll.controllers;

import com.hrpayroll.hrpayroll.entities.Payment;
import com.hrpayroll.hrpayroll.services.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/payments")
public class PaymentController {

    private final PaymentService service;

    @GetMapping(value = "/{workerId}/days/{days}")
    public ResponseEntity<Payment> getPayment( @PathVariable int workerId, @PathVariable int days) {
        var payment = service.getPayment(workerId, days);
        return ResponseEntity.ok(payment);
    }
}
