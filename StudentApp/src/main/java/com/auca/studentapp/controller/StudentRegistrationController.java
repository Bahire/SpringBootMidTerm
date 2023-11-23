package com.auca.studentapp.controller;

import com.auca.studentapp.model.*;
import com.auca.studentapp.service.implementation.AcademicUnitServiceImpl;
import com.auca.studentapp.service.implementation.SemesterServiceImpl;
import com.auca.studentapp.service.implementation.StudentRegistrationServiceImpl;
import com.auca.studentapp.service.implementation.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registration")
public class StudentRegistrationController {
    @Autowired private StudentRegistrationServiceImpl registrationService;
    @Autowired private StudentServiceImpl studentService;
    @Autowired private SemesterServiceImpl semesterService;
    @Autowired private AcademicUnitServiceImpl academicUnitService;

    @GetMapping("/")
    public List<StudentRegistration> registrations(){
        return registrationService.registrations();
    }
    @PostMapping("/new")
    public StudentRegistration registerNewRecord(@RequestBody StudentRegistration registration){
        Student theStudent = studentService.searchStudent(registration.getStudent());
        Semester theSemester = semesterService.searchSemester(registration.getTheSemester());
        AcademicUnit unit = academicUnitService.searchUnit(registration.getDepartment());
        if(theStudent!=null){
            registration.setStudent(theStudent);
            if(theSemester !=null)
                registration.setTheSemester(theSemester);
            registration.setStatus(ERegistrationStatus.PENDING);
            if(unit !=null)
                registration.setDepartment(unit);
            return registrationService.registerStudent(registration);
        }
        return null;
    }
    @PostMapping("findStudentDepertmentSemester")
    public List<StudentRegistration> allStudents(@RequestBody StudentRegistration registration){
        Semester theSemester = semesterService.searchSemester(registration.getTheSemester());
        AcademicUnit dep = academicUnitService.searchUnit(registration.getDepartment());
        if(theSemester!=null && dep !=null)
            return registrationService.searchStudentDepertmentSemester(theSemester,dep);
        return null;
    }
}
