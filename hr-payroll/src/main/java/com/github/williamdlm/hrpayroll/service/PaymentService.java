package com.github.williamdlm.hrpayroll.service;

import com.github.williamdlm.hrpayroll.model.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public Payment getPayment(long workerId,int days){
        return new Payment("Bob",200.0,days);

    }
}
