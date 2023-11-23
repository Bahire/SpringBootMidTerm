package com.auca.studentapp.repository;

import com.auca.studentapp.model.AcademicUnit;
import com.auca.studentapp.model.Semester;
import com.auca.studentapp.model.StudentRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRegistrationRepo extends JpaRepository<StudentRegistration,Integer> {
    @Query("select s from StudentRegistration s where s.theSemester=:theSemester AND s.department=:dep")
    List<StudentRegistration> findBySemesterDepertment(@Param("theSemester") Semester theSemester, @Param("dep")AcademicUnit dep);
}
