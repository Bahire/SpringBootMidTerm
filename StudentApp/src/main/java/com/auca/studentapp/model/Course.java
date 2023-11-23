package com.auca.studentapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    @Id
    private Integer id;
    @OneToOne
    @JoinColumn(name = "semester_id")
    private Semester theSemester;
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher theTeacher;
    @OneToOne
    @JoinColumn(name = "department")
    private AcademicUnit unit;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private CourseDefinition definition;
}
