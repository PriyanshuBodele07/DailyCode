package com.example.crudSpringBoot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudSpringBoot.entity.Student;
import com.example.crudSpringBoot.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public String createStudent(@RequestBody Student student){
      Student createStudent = studentService.createStudent(student);
      return "Student Created";

    }

    
}