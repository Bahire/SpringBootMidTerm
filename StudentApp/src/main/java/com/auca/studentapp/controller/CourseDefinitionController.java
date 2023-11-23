package com.auca.studentapp.controller;

import com.auca.studentapp.model.CourseDefinition;
import com.auca.studentapp.service.implementation.CourseDefinitionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/definition")
public class CourseDefinitionController {
    @Autowired private CourseDefinitionServiceImpl definitionService;

    @GetMapping
    public List<CourseDefinition> allCourses(){
        return  definitionService.courses();
    }

    @PostMapping("/new")
    public CourseDefinition newCourse(@RequestBody CourseDefinition course){
        return definitionService.registerDefinition(course);
    }
}
