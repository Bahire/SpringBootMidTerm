package com.auca.studentapp.repository;

import com.auca.studentapp.model.Semester;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemesterRepo extends JpaRepository<Semester,Integer> {
}
