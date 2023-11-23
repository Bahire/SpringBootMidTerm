package com.auca.studentapp.service;

import com.auca.studentapp.model.Teacher;

import java.util.List;

public interface TeacherService {
    Teacher registerTeacher(Teacher teacher);
    Teacher updateDefinition(Teacher teacher);
    Teacher deleteDefinition(Teacher teacher);
    Teacher searchDefinition(Teacher teacher);
    List<Teacher> teachers();
}
