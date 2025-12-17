package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User{
    @Id
    @GenerateValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Column(unique=true,nullable=false)
    private String email;

    Private String password;

    private String role;

    public Long getId(){
        return id;
    }
    
    public Void setId(long id){
        this.id=id;
    }

    public String getName(){
        return name;

    }

    public Void setName(String name){
        this.name=name;
    }

    public String getEmail(){
        return email;
    }

    public Void setEmail(String email){
        this.email=email;
    }

    public String getPassword(){
        return password;
    }

    public Void setPassword(String getPassword){
        this.password=password;
    }

    public String getRole(){
        return role;

    }

    public Void setRole(String role){
        this.role;
    }


}
