package com.apiexample2.apiexample2.service;

import com.apiexample2.apiexample2.entity.StudentRegistration;
import com.apiexample2.apiexample2.repository.StudentRegistrationRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentRegistrationServiceImpl implements StudentRegistrationService {

    private StudentRegistrationRepository studentRegistrationRepository;

    public StudentRegistrationServiceImpl(StudentRegistrationRepository studentRegistrationRepository) {
        this.studentRegistrationRepository = studentRegistrationRepository;
    }

    @Override
    public StudentRegistration createStudentRegistration(StudentRegistration studentRegistration) {
        StudentRegistration savedEntity    = studentRegistrationRepository.save(studentRegistration);
        return savedEntity;
    }
}
