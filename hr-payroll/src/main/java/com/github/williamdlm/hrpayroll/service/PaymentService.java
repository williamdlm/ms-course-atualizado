package com.github.williamdlm.hrpayroll.service;

import com.github.williamdlm.hrpayroll.feignclient.WorkerFeignClient;
import com.github.williamdlm.hrpayroll.model.Payment;
import com.github.williamdlm.hrpayroll.model.Worker;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Service
@RequiredArgsConstructor
public class PaymentService {

    private final WorkerFeignClient workerFeignClient;


    public Payment getPayment(long workerId, int days) {
        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);

    }
}
