package com.apiexample2.apiexample2.repository;

import com.apiexample2.apiexample2.entity.StudentRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRegistrationRepository extends JpaRepository<StudentRegistration, Long> {


}