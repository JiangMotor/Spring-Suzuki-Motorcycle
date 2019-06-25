package com.example.jiangsuzuki.model.datasuzuki;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Datasuzuki{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String suzuki_id;
    private String data_suzuki;
    private String detail;
    private String image;
    


}