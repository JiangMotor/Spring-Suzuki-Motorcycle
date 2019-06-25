package com.example.jiangsuzuki.model.productsuzuki;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Productsuzuki{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String suzuki_id;
    private String product_suzuki;
}