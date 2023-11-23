package com.auca.studentapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentRegistration {
    @Id
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    @Column(name = "registration_date")
    private Date registrationDate=new Date();
    private ERegistrationStatus status;
    @ManyToOne
    @JoinColumn(name = "semester_id")
    private Semester theSemester;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private AcademicUnit department;
}
