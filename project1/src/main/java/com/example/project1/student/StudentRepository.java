package com.example.project1.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository
        extends JpaRepository<Student, Long> {
    Optional<Student> findStudentByEmail(String email);
  //will transform it to an SQL kima : SELECT * FROM student where emai =....

}
