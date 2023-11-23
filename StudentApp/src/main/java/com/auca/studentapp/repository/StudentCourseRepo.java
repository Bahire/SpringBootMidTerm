package com.auca.studentapp.repository;

import com.auca.studentapp.model.StudentCourse;
import com.auca.studentapp.model.StudentRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentCourseRepo extends JpaRepository<StudentCourse,Integer> {
    @Query("select sc from StudentCourse sc where sc.registration=:registration")
    List<StudentCourse> findByCondition(@Param("registration") StudentRegistration registration);
}
