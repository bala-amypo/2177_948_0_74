package com.example.demo.service.impl;

import com.example.demo.service.*;
import com.example.demo.repository.*;
import com.example.demo.entity.*;
import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
@Service

public class StudentServiceImpl implements StudentService{

    @Autowired
    studentRepo repo;    

    public List<StudentEntity>getAll(){
        return repo.findAll();
    }

    public StudentEntity addStudent(StudentEntity student){
        return repo.save(student);
    }
    
 
}