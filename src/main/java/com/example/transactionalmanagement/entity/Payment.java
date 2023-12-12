package com.example.transactionalmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="Payment")
@Data
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String price;
    private boolean status;

    @OneToOne
    private User user;

}
