package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.persistence.validation.constaints.*;


@Entity
public class studentEntity{
    @Id
    @GenerateValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotBlank("Name is not valid")
    private String name;

    @Email(message="Email Formate is not Valid")
    private String email;


    public Long getId(){
        return id;
    }
    public Void setId(String id){
        this id=id;
    }

    public studentEntity(){}

    public studentEntity(Long id,Sting name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }

}