package com.github.williamdlm.hrpayroll.service;

import com.github.williamdlm.hrpayroll.model.Payment;
import com.github.williamdlm.hrpayroll.model.Worker;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;


@Service
@RequiredArgsConstructor
public class PaymentService {

    private final RestTemplate restTemplate;

    @Value("${hr-worker.host}")
    private String workerHost;

    public Payment getPayment(long workerId,int days){
        Map<String,String> uriVariables = new HashMap<>();
        uriVariables.put("id",""+workerId);
        Worker worker = restTemplate.getForObject(workerHost+"/{id}", Worker.class, uriVariables);
        return new Payment(worker.getName(), worker.getDailyIncome(), days);

    }
}
