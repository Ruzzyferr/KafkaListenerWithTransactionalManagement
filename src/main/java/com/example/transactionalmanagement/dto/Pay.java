package com.example.transactionalmanagement.dto;

import com.example.transactionalmanagement.entity.User;
import lombok.Data;

@Data
public class Pay {

    private User user;

    private String amount;

}
