package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;
import com.example.demo.entity.StudentEntity;



public interface studentRepo extends JpaRepository<StudentEntity,Long>{
      
}