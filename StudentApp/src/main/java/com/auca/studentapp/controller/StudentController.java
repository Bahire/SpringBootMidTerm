package com.auca.studentapp.controller;

import com.auca.studentapp.model.Student;
import com.auca.studentapp.service.implementation.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired private StudentServiceImpl studentService;
    @GetMapping("/")
    public List<Student> allStudent(){
        return studentService.students();
    }
    @PostMapping("/save")
    public Student registerStudent(@RequestBody Student theStudent){
        return studentService.registerStudent(theStudent);
    }
    @PostMapping("/update")
    public Student updateStudent(@RequestBody Student theStudent){
        return studentService.updateStudent(theStudent);
    }

    @PostMapping("/delete")
    public Student deleteStudent(@RequestBody Student theStudent){
        return studentService.deleteStudent(theStudent);
    }


}
