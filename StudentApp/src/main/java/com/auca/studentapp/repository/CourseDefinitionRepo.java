package com.auca.studentapp.repository;

import com.auca.studentapp.model.CourseDefinition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDefinitionRepo extends JpaRepository<CourseDefinition,String> {
}
