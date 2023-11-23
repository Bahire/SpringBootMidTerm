package com.auca.studentapp.controller;

import com.auca.studentapp.model.*;
import com.auca.studentapp.service.implementation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired private CourseServiceImpl courseService;
    @Autowired private SemesterServiceImpl semesterService;
    @Autowired private TeacherServiceImpl teacherService;
    @Autowired private CourseDefinitionServiceImpl definitionService;
    @Autowired private AcademicUnitServiceImpl unitService;

    @GetMapping
    public List<Course> courses(){
        return courseService.courses();
    }
    @PostMapping("/new")
    public Course registerCourse(@RequestBody Course theCourse){
        Semester theSemester = semesterService.searchSemester(theCourse.getTheSemester());
        Teacher theTeacher = teacherService.searchDefinition(theCourse.getTheTeacher());
        CourseDefinition definition = definitionService.searchDefinition(theCourse.getDefinition());
        AcademicUnit unit = unitService.searchUnit(theCourse.getUnit());
        if(theSemester!=null) {
            theCourse.setTheSemester(theSemester);
            if (theTeacher != null)
                theCourse.setTheTeacher(theTeacher);
            if (definition != null)
                theCourse.setDefinition(definition);
            if (unit != null)
                theCourse.setUnit(unit);
            return courseService.registerCourse(theCourse);
        }
        return null;
    }

    @PostMapping("/findCourseDepartmentSemester")
    public List<Course> findCourses(@RequestBody Course theCourse){
        Semester theSemester = semesterService.searchSemester(theCourse.getTheSemester());
        AcademicUnit dep = unitService.searchUnit(theCourse.getUnit());
        if(theSemester!=null && dep !=null)
            return courseService.findCoursePerDepertmentSemester(theSemester,dep);
        return null;
    }
}
