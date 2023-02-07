package com.hrpayroll.hrpayroll.services;

import com.hrpayroll.hrpayroll.entities.Payment;
import com.hrpayroll.hrpayroll.integration.clients.WorkerClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final WorkerClient workerClient;

    public Payment getPayment( int workerId, int days) {
        var worker = workerClient.findById( workerId ).getBody();

        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
