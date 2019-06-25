package com.example.jiangsuzuki.model.paymentsuzuki;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Paymentsuzuki{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String suzuki_id;
    private String payment_suzuki;
}