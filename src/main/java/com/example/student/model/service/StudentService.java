package com.example.student.model.service;

import com.example.student.model.StudentEntity;
import com.example.student.model.repository.StudentReopository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentReopository studentReopository;
    public List<StudentEntity> getStudents(){
        return studentReopository.findAll();

    }

}
