package com.auca.studentapp.controller;

import com.auca.studentapp.model.AcademicUnit;
import com.auca.studentapp.service.implementation.AcademicUnitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/unit")
public class UnitController {
    @Autowired private AcademicUnitServiceImpl unitService;

    @GetMapping("/")
    public List<AcademicUnit> units(){
        return unitService.units();
    }

    @PostMapping("/new")
    public AcademicUnit registerUnit(@RequestBody AcademicUnit unit){
        return unitService.registerUnit(unit);
    }

}
