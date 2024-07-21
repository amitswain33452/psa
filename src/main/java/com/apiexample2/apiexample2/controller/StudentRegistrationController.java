package com.apiexample2.apiexample2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/registration")


public class StudentRegistrationController {
    //http://localhost:8080/api/v1/registration
    @GetMapping
    public String getStudentRegistration(){
        return  "done";


    }
}
