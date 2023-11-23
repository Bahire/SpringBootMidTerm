package com.auca.studentapp.service.implementation;

import com.auca.studentapp.model.StudentCourse;
import com.auca.studentapp.repository.StudentCourseRepo;
import com.auca.studentapp.service.StudentCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentCourseServiceImpl implements StudentCourseService {
    @Autowired private StudentCourseRepo repo;
    @Override
    public StudentCourse registerStudentCourse(StudentCourse studentCourse) {
        return repo.save(studentCourse);
    }

    @Override
    public StudentCourse updateDefinition(StudentCourse studentCourse) {
        return repo.save(studentCourse);
    }

    @Override
    public StudentCourse deleteDefinition(StudentCourse studentCourse) {
        repo.delete(studentCourse);
        return studentCourse;
    }

    @Override
    public StudentCourse searchDefinition(StudentCourse studentCourse) {
        return repo.findById(studentCourse.getId()).get();
    }

    @Override
    public List<StudentCourse> studentCourses() {
        return repo.findAll();
    }

    @Override
    public List<StudentCourse> findCoursePerStudent(StudentCourse theStudentCourse) {
        return repo.findByCondition(theStudentCourse.getRegistration());
    }
}
