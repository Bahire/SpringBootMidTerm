package com.auca.studentapp.service;

import com.auca.studentapp.model.AcademicUnit;

import java.util.List;

public interface AcademicUnitService {
    AcademicUnit registerUnit(AcademicUnit unit);
    AcademicUnit updateUnit(AcademicUnit unit);
    AcademicUnit deleteUnit(AcademicUnit unit);
    AcademicUnit searchUnit(AcademicUnit unit);
    List<AcademicUnit> units();

}
