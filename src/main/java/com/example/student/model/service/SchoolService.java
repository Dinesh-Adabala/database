package com.example.student.model.service;

public class SchoolService {
    private  int teacherCount = 20;

    public SchoolService(){
        System.out.println("from school service="+teacherCount());
    }
    public  int teacherCount(){
        return teacherCount;

    }
    public  int  teacherAdded(){
        return teacherCount= teacherCount+1 ;
    }
    public  int teacherRemove(){
        return teacherCount = teacherCount-1;
    }
}
