package com.example.student.model.service;

public class Memory {
    int staticVariable = 10;
    int instanceVariable = 100;
    public void getResult(){
        staticVariable=staticVariable+1;
        instanceVariable = instanceVariable + staticVariable +1;
        System.out.println("From static variable :"+staticVariable);
        System.out.println("From instance Variable :"+instanceVariable);
    }

}
