
package com.example.demo.entity;
import jarkarta.persistence.*;
@Entity
public class Vehical{

    @id
    @GenerateValue(strategy=GenerationType.IDENTITY)
    Private Long id;

    @ManyToOne
    private User user;

    @Column(unique=true,nullable=false)
    private String vehicalNumber;

    private Double fuelEfficiency;

    public Vehicle(){}
    }
}