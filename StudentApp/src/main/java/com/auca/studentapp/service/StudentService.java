package com.auca.studentapp.service;

import com.auca.studentapp.model.Student;

import java.util.List;

public interface StudentService {
    Student registerStudent(Student student);
    Student updateStudent(Student student);
    Student deleteStudent(Student student);
    Student searchStudent(Student student);
    List<Student> students();
}
