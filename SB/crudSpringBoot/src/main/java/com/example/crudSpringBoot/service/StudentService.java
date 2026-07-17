package com.example.crudSpringBoot.service;

import java.util.List;
import java.util.Optional;

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
        
        Student studentResp =studentRepository.save(studentReq); 
        return studentResp;

    }

    public Student getStudent(Long id){
        Optional<Student> studentResp = studentRepository.findById(id);

        if (studentResp.isPresent()) {
            return studentResp.get();            
        }
        return null;
    }

    public List<Student> getAllStudent(){
        List<Student> studentList = studentRepository.findAll();
        return studentList;
    }

    public Student updateStudent(Long id, Student studentReq){
        Optional<Student> existingStudent = studentRepository.findById(id);
        
        if (existingStudent.isEmpty()) {
            return null;
        }
        return studentReq;
    }

    public Boolean deleteStudent(Long id){
        Boolean isStudent = studentRepository.existsById(id);

        if (!isStudent) return false;

        studentRepository.deleteById(id);

        return true;

    }
}
