package com.example.project1.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {
    private final StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService ) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping //we take a requestboody and we map it fel student
    public void registerNewStudent(@RequestBody  Student student){
        studentService.addNewStudent(student);

    }

    @DeleteMapping(path = {"studentId"})
    public void deleteStudent(@PathVariable("studentId") Long studentId){
            studentService.deleteStudent(studentId);
    }

    @PutMapping(path={"studentId"})
    public void putStudent(@PathVariable("studentId") Long studentId,
        @RequestParam(required = false) String name,
        @RequestParam(required = false) String email){

        studentService.putStudent(studentId,name,email);

    }
}

