package org.example.repository;

import org.example.model.Student;

import java.util.List;

public interface StudentRepository {
    void save(Student student);
    Student findById(int id);
    List<Student> findAll();
}
