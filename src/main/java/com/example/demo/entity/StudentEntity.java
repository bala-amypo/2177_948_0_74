package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class StudentEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="Name is not Valid")
    private String name;

    @Email(message="Email Format is not Valid")
    private String email;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public StudentEntity(){

    }

    public StudentEntity(Long id,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }
    
   
}