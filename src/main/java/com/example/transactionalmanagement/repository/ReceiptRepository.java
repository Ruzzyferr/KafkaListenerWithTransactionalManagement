package com.example.transactionalmanagement.repository;

import com.example.transactionalmanagement.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceiptRepository extends JpaRepository<Payment,Integer> {
}
