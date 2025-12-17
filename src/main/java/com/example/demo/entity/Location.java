
package com.example.demo.entity;

import jarkarta.persistence.*;

@Entity
public class Location{

    @Id
    @GenerateValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double latitude;
    private Double longitude;

    public Location(){}

    public Long getId(){
        return id;
    }

    public Void setId(Long id){
        return id;
    }
    

}