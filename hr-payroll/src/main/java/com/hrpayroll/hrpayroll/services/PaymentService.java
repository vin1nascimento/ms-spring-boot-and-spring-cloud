package com.hrpayroll.hrpayroll.services;

import com.hrpayroll.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PaymentService {

    public Payment getPayment( int workerId, int days) {
        return new Payment("Bob", BigDecimal.valueOf( 200 ), days);
    }
}
