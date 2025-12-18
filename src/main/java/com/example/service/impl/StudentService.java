package com.example.demo.service;

import com.example.demo.entity.*;
import java.util.*;

public interface StudentService{

    List<StudentEntity>getAll();

    studentEntity addStudent(StudentEntity student );
}