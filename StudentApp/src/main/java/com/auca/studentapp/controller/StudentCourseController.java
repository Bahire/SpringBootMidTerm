package com.auca.studentapp.controller;

import com.auca.studentapp.model.Course;
import com.auca.studentapp.model.StudentCourse;
import com.auca.studentapp.model.StudentRegistration;
import com.auca.studentapp.service.implementation.StudentCourseServiceImpl;
import com.auca.studentapp.service.implementation.StudentRegistrationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/studentCourse")
public class StudentCourseController {
    @Autowired private StudentCourseServiceImpl studentCourseService;
    @Autowired private StudentRegistrationServiceImpl registrationService;
    @GetMapping
    public List<StudentCourse> allStudentCourses(){
        return studentCourseService.studentCourses();
    }

    @PostMapping("/new")
    public StudentCourse register(@RequestBody StudentCourse theStudentCourse){
        return studentCourseService.registerStudentCourse(theStudentCourse);
    }

    @PostMapping("/takes")
    public List<Course> allCoursePerStudent(StudentCourse theStudentCourse){
        StudentRegistration registration = registrationService.searchStudentRegistration(theStudentCourse.getRegistration());
        List<Course> courses = new ArrayList<>();
        if(registration!=null){
            List<StudentCourse> studentCourses = studentCourseService.findCoursePerStudent(theStudentCourse);
            for (StudentCourse studentCourse : studentCourses){
                courses.add(studentCourse.getTheCourse());
            }
            return courses;
        }
            return null;
    }
}
