package com.auca.studentapp.service;


import com.auca.studentapp.model.CourseDefinition;

import java.util.List;

public interface CourseDefinitionService {
    CourseDefinition registerDefinition(CourseDefinition unit);
    CourseDefinition updateDefinition(CourseDefinition unit);
    CourseDefinition deleteDefinition(CourseDefinition unit);
    CourseDefinition searchDefinition(CourseDefinition unit);
    List<CourseDefinition> courses();

}
