package com.auca.studentapp.repository;

import com.auca.studentapp.model.AcademicUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademicUnitRepo extends JpaRepository<AcademicUnit,String> {
}
