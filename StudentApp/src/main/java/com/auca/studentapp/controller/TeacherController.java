package com.auca.studentapp.controller;

import com.auca.studentapp.model.Teacher;
import com.auca.studentapp.service.implementation.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired private TeacherServiceImpl teacherService;
    @GetMapping
    public List<Teacher> allTeachers(){
        return teacherService.teachers();
    }
    @PostMapping("/new")
    public Teacher registerTeacher(@RequestBody Teacher teacher){
        return teacherService.registerTeacher(teacher);
    }
}
