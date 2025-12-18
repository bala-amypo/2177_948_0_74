package com.example.demo.service;

import com.example.demo.entity.*;
import java.util.*;

interface StudentService{

    List<StudentEntity>getAll();

    studentEntity addStudent(StudentEntity student );
}