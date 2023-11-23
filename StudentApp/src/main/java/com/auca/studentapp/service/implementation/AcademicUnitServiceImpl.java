package com.auca.studentapp.service.implementation;

import com.auca.studentapp.model.AcademicUnit;
import com.auca.studentapp.repository.AcademicUnitRepo;
import com.auca.studentapp.service.AcademicUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcademicUnitServiceImpl implements AcademicUnitService {

    @Autowired private AcademicUnitRepo repo;
    @Override
    public AcademicUnit registerUnit(AcademicUnit unit) {
        return repo.save(unit);
    }

    @Override
    public AcademicUnit updateUnit(AcademicUnit unit) {
        return repo.save(unit);
    }

    @Override
    public AcademicUnit deleteUnit(AcademicUnit unit) {
        repo.delete(unit);
        return unit;
    }

    @Override
    public AcademicUnit searchUnit(AcademicUnit unit) {
        return repo.findById(unit.getCode()).get();
    }

    @Override
    public List<AcademicUnit> units() {
        return repo.findAll();
    }
}
