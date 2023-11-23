package com.auca.studentapp.service.implementation;

import com.auca.studentapp.model.CourseDefinition;
import com.auca.studentapp.repository.CourseDefinitionRepo;
import com.auca.studentapp.service.CourseDefinitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseDefinitionServiceImpl implements CourseDefinitionService {
    @Autowired private CourseDefinitionRepo repo;

    @Override
    public CourseDefinition registerDefinition(CourseDefinition unit) {
        return repo.save(unit);
    }

    @Override
    public CourseDefinition updateDefinition(CourseDefinition unit) {
        return repo.save(unit);
    }

    @Override
    public CourseDefinition deleteDefinition(CourseDefinition unit) {
        repo.delete(unit);
        return unit;
    }

    @Override
    public CourseDefinition searchDefinition(CourseDefinition unit) {
        return repo.findById(unit.getCode()).get();
    }

    @Override
    public List<CourseDefinition> courses() {
        return repo.findAll();
    }
}
