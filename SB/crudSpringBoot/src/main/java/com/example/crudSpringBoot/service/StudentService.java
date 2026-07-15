package com.example.crudSpringBoot.service;

import org.springframework.stereotype.Service;

import com.example.crudSpringBoot.entity.Student;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    


    public Student createStudent(Student studentReq){

    }
}
