package com.example.jiangsuzuki.model.suzuki;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Suzuki{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String img_suzuki;
    private String name_suzuki;
    private String video_suzuki;
    private String category;
    


}