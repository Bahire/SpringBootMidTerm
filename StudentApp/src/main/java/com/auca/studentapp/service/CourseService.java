package com.auca.studentapp.service;

import com.auca.studentapp.model.AcademicUnit;
import com.auca.studentapp.model.Course;
import com.auca.studentapp.model.Semester;

import java.util.List;

public interface CourseService {
    Course registerCourse(Course course);
    Course updateCourse(Course course);
    Course deleteCourse(Course course);
    Course searchCourse(Course course);
    List<Course> courses();

    List<Course> findCoursePerDepertmentSemester(Semester theSemester, AcademicUnit dep);
}
