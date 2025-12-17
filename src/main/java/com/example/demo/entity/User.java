package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User{
    @id
    @GenerateValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;
    @column(unique=true,nullable=false)
    private String email;

    Private String password;

    private String role;

    public Long getid(){
        return id;
    }
    
    public void setid(long id){
        this.id=id;
    }

    public String getName(){
        return name;

    }

    public void setName(String name){
        this.name=name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String getPassword){
        this.password=password;
    }

    public String getRole(){
        return role;

    }

    public void setRole(String role){
        this.role;
    }


}
