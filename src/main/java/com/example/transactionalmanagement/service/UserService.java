package com.example.transactionalmanagement.service;

import com.example.transactionalmanagement.dto.Pay;
import com.example.transactionalmanagement.entity.Payment;
import com.example.transactionalmanagement.entity.User;
import com.example.transactionalmanagement.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    private final PaymentService paymentService;
    public UserService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    @Transactional
    public User pay(Pay pay) throws Exception {
        User employeeSavedToDB = userRepository.save(pay.getUser());



        Payment payment = new Payment();
        payment.setUser(pay.getUser());
        payment.setPrice(pay.getAmount());

        paymentService.addPayment(payment);
        return employeeSavedToDB;
    }
}
