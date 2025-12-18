package com.example.demo.service;
import org.springframework.stereotype.Service;


import com.example.demo.entity.*;
import java.util.*;

public interface StudentService{

    List<StudentEntity>getAll();

    StudentEntity addStudent(StudentEntity student );

    StudentEntity getbyId(Long id);
}