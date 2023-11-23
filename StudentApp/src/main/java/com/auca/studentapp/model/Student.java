package com.auca.studentapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @Column(name = "reg_no")
    private String regNo;
    private String names;
    @Column(name = "dob")
    private String dateOfBirth;
}
