package com.auca.studentapp.service.implementation;

import com.auca.studentapp.model.Student;
import com.auca.studentapp.repository.StudentRepo;
import com.auca.studentapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired private StudentRepo repo;
    @Override
    public Student registerStudent(Student student) {
        return repo.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return repo.save(student);
    }

    @Override
    public Student deleteStudent(Student student) {
        repo.delete(student);
        return student;
    }

    @Override
    public Student searchStudent(Student student) {
        return null;
    }

    @Override
    public List<Student> students() {
        return repo.findAll();
    }
}
