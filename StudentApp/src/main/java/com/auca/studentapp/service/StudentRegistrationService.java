package com.auca.studentapp.service;

import com.auca.studentapp.model.AcademicUnit;
import com.auca.studentapp.model.Semester;
import com.auca.studentapp.model.StudentRegistration;

import java.util.List;

public interface StudentRegistrationService {
    StudentRegistration registerStudent(StudentRegistration studentRegistration);
    StudentRegistration updateDefinition(StudentRegistration studentRegistration);
    StudentRegistration deleteDefinition(StudentRegistration studentRegistration);
    StudentRegistration searchStudentRegistration(StudentRegistration studentRegistration);
    List<StudentRegistration> registrations();

    List<StudentRegistration> searchStudentDepertmentSemester(Semester theSemester, AcademicUnit dep);
}
