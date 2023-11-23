package com.auca.studentapp.service.implementation;

import com.auca.studentapp.model.AcademicUnit;
import com.auca.studentapp.model.Semester;
import com.auca.studentapp.model.StudentRegistration;
import com.auca.studentapp.repository.StudentRegistrationRepo;
import com.auca.studentapp.service.StudentRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentRegistrationServiceImpl implements StudentRegistrationService {
    @Autowired private StudentRegistrationRepo repo;
    @Override
    public StudentRegistration registerStudent(StudentRegistration studentRegistration) {
        return repo.save(studentRegistration);
    }

    @Override
    public StudentRegistration updateDefinition(StudentRegistration studentRegistration) {
        return repo.save(studentRegistration);
    }

    @Override
    public StudentRegistration deleteDefinition(StudentRegistration studentRegistration) {
        repo.delete(studentRegistration);
        return studentRegistration;
    }

    @Override
    public StudentRegistration searchStudentRegistration(StudentRegistration studentRegistration) {
        return repo.findById(studentRegistration.getId()).get();
    }

    @Override
    public List<StudentRegistration> registrations() {
        return repo.findAll();
    }

    @Override
    public List<StudentRegistration> searchStudentDepertmentSemester(Semester theSemester, AcademicUnit dep) {
        return repo.findBySemesterDepertment(theSemester,dep);
    }
}
