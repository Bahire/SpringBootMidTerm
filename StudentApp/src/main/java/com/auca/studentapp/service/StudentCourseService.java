package com.auca.studentapp.service;

import com.auca.studentapp.model.StudentCourse;

import java.util.List;

public interface StudentCourseService {
    StudentCourse registerStudentCourse(StudentCourse studentCourse);
    StudentCourse updateDefinition(StudentCourse studentCourse);
    StudentCourse deleteDefinition(StudentCourse studentCourse);
    StudentCourse searchDefinition(StudentCourse studentCourse);
    List<StudentCourse> studentCourses();

    List<StudentCourse> findCoursePerStudent(StudentCourse theStudentCourse);
}
