package com.luciano.hrpayroll.services;

import com.luciano.hrpayroll.domain.Payment;
import com.luciano.hrpayroll.domain.Worker;
import com.luciano.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(Long id, Integer days){
        Worker worker = (Worker) workerFeignClient.findById(id).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
