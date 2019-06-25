package com.example.jiangsuzuki.model.promotionsuzuki;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Promotionsuzuki{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String suzuki_id;
    private String promotion_suzuki;
    private String detail;
}