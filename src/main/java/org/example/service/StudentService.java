package org.example.service;

import org.example.model.Student;

public interface StudentService {
    void createStudent(Student student);
    Student findStudentById(int id);
    void displayAllStudents();
}
