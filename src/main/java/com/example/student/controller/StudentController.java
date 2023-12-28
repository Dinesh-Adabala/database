package com.example.student.controller;

import com.example.student.model.StudentEntity;
import com.example.student.model.service.SchoolService;
import com.example.student.model.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping(value="/getStudent")
    public List<StudentEntity> getStudents(){
        return  studentService.getStudents();
    }
    @GetMapping(value ="/getteacherCount" )
    public int teacherCount(){
        SchoolService s = new SchoolService();
        return s.teacherCount();
    }
    @GetMapping(value ="/teacherAdded" )
    public int teacherAdded() {
        SchoolService s = new SchoolService();
        return s.teacherAdded();
    }
    @GetMapping(value ="/teacherRemove" )
    public int teacherRemove() {
        SchoolService s = new SchoolService();
        return s.teacherRemove();
    }
}
