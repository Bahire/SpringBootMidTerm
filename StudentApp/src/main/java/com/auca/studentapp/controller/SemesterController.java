package com.auca.studentapp.controller;

import com.auca.studentapp.model.Semester;
import com.auca.studentapp.model.StudentRegistration;
import com.auca.studentapp.service.implementation.SemesterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/semester")
public class SemesterController {
    @Autowired private SemesterServiceImpl semesterService;
    @GetMapping
    public List<Semester> allSemesters(){
        return semesterService.semesters();
    }
    @PostMapping("/new")
    public Semester registerSemester(@RequestBody Semester theSemester){
        return semesterService.registerSemester(theSemester);
    }

    @PostMapping("/find")
    public Semester findSemester(@RequestBody Semester semester){
        return semesterService.searchSemester(semester);
    }
    @PostMapping("/findSemesterStudent")
    public List<StudentRegistration> findAllStudentPerSemester(@RequestBody Semester semester){
        return semesterService.searchSemester(semester).getRegistrations();
    }
}
