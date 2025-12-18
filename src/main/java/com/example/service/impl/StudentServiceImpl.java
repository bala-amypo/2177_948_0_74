package com.example.demo.service.impl;
import org.springframework.stereotype.Service;


import com.example.demo.service.*;
import com.example.demo.repository.*;
import com.example.demo.entity.*;
import com.example.demo.exception.*;
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

    public StudentEntity getbyId(Long id){
    return repo.findbyId(id).orElseThrow(() -> new StudentNotFoundException("Student Id not Found"));

    }

    public StudentEntity updateById(Long id,StudentEntity newstu){
        StudentEntity existing=getbyId(id);

    }

    @DeleteMapping("/delete/{id}"){
        public String deleteById(id)
    }

    
 
}