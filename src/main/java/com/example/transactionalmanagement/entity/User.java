package com.example.transactionalmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="EMP_INFO")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

}
