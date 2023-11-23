package com.auca.studentapp.service.implementation;

import com.auca.studentapp.model.AcademicUnit;
import com.auca.studentapp.model.Course;
import com.auca.studentapp.model.Semester;
import com.auca.studentapp.repository.CourseRepo;
import com.auca.studentapp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired private CourseRepo repo;
    @Override
    public Course registerCourse(Course course) {
        return repo.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return repo.save(course);
    }

    @Override
    public Course deleteCourse(Course course) {
        repo.save(course);
        return course;
    }

    @Override
    public Course searchCourse(Course course) {
        return null;
    }

    @Override
    public List<Course> courses() {
        return repo.findAll();
    }

    @Override
    public List<Course> findCoursePerDepertmentSemester(Semester theSemester, AcademicUnit dep) {
        return repo.findByCondition(theSemester,dep);
    }
}
