package com.auca.studentapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentCourse {
    @Id
    private Integer id;
    private Integer credits;
    private BigDecimal results;
    @ManyToOne
    @JoinColumn(name = "registration_id")
    private StudentRegistration registration;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course theCourse;
}
