package com.auca.studentapp.service.implementation;

import com.auca.studentapp.model.Teacher;
import com.auca.studentapp.repository.TeacherRepo;
import com.auca.studentapp.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired private TeacherRepo repo;
    @Override
    public Teacher registerTeacher(Teacher teacher) {
        return repo.save(teacher);
    }

    @Override
    public Teacher updateDefinition(Teacher teacher) {
        return repo.save(teacher);
    }

    @Override
    public Teacher deleteDefinition(Teacher teacher) {
        repo.delete(teacher);
        return teacher;
    }

    @Override
    public Teacher searchDefinition(Teacher teacher) {
        return repo.findById(teacher.getCode()).get();
    }

    @Override
    public List<Teacher> teachers() {
        return repo.findAll();
    }
}
