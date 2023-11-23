package com.auca.studentapp.service.implementation;

import com.auca.studentapp.model.Semester;
import com.auca.studentapp.repository.SemesterRepo;
import com.auca.studentapp.service.SemesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SemesterServiceImpl implements SemesterService {
    @Autowired private SemesterRepo repo;
    @Override
    public Semester registerSemester(Semester semester) {
        return repo.save(semester);
    }

    @Override
    public Semester updateDefinition(Semester semester) {
        return repo.save(semester);
    }

    @Override
    public Semester deleteDefinition(Semester semester) {
        repo.delete(semester);
        return semester;
    }

    @Override
    public Semester searchSemester(Semester semester) {
        return repo.findById(semester.getId()).get();
    }

    @Override
    public List<Semester> semesters() {
        return repo.findAll();
    }
}
