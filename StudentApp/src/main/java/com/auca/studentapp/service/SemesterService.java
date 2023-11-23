package com.auca.studentapp.service;

import com.auca.studentapp.model.Semester;

import java.util.List;

public interface SemesterService {
    Semester registerSemester(Semester semester);
    Semester updateDefinition(Semester semester);
    Semester deleteDefinition(Semester semester);
    Semester searchSemester(Semester semester);
    List<Semester> semesters();
}
