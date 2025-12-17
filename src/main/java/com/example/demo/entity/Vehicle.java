
package com.example.demo.entity;
import jarkarta.persistence.*;
@Entity
public class Vehical{

    @Id
    @GenerateValue(strategy=GenerationType.IDENTITY)
    Private Long id;

    @ManyToOne
    private User user;

    @Column(unique=true,nullable=false)
    private String vehicalNumber;

    private Double fuelEfficiency;

    public Vehicle(){}
    
    public Long getId(){
        return id;
    }
    public Void setId(Long id){
        this.id=id;
    }

    public User getUser(){
        return user;
    }

    public Void setUser(User user){
        this.user=user;
    }

    public String getVehicleNumber(){
        return vechicleNumber;
    }

    public Double getCapacityKg(Double capacityKg){
        this.capacityKg=capacityKg;
    }

    public Double getFuelEfficiency(){
        return fuelEfficiency;
    }

    public Void setFuelEfficiency(Double fuelEfficiency){
        this.fuelEfficiency=fuelEfficiency;
    }


}