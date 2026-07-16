package com.example.crudSpringBoot.service;

import org.springframework.stereotype.Service;

import com.example.crudSpringBoot.entity.Student;
import com.example.crudSpringBoot.repository.StudentRepository;;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    


    public Student createStudent(Student studentReq){
        System.out.println("inside student Service");
        Student studentResp =studentRepository.saveStudent(studentReq); 
        return studentResp;

    }
}
