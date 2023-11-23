package com.auca.studentapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AcademicUnit {
    @Id
    private String code;
    private String name;
    private EAcademicUnit unit;
    @ManyToOne
    @JoinColumn(name = "parent")
    private AcademicUnit parent;

}
