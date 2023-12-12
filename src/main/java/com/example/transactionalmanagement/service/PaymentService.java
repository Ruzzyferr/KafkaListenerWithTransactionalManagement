package com.example.transactionalmanagement.service;

import com.example.transactionalmanagement.entity.Payment;
import com.example.transactionalmanagement.repository.ReceiptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Random;


@Service
public class PaymentService {
    @Autowired
    private ReceiptRepository repository;
    public void addPayment(Payment payment) {

        Random rand = new Random();

        int rand_int1 = rand.nextInt(10);

        if(rand_int1 % 2 == 0){
            throw new RuntimeException();
        }else{
            repository.save(payment);
        }

    }
}
