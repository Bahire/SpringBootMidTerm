package com.auca.studentapp.repository;

import com.auca.studentapp.model.AcademicUnit;
import com.auca.studentapp.model.Course;
import com.auca.studentapp.model.Semester;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepo extends JpaRepository<Course,String> {
    @Query("select c from Course  c where c.theSemester=:theSemester AND c.unit =:dep")
    List<Course> findByCondition(@Param("theSemester") Semester theSemester,@Param("theSemester") AcademicUnit dep);
}
