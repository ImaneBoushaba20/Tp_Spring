package org.example.service;

import org.example.model.Student;
import org.example.repository.StudentRepository;

import java.util.List;

public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void createStudent(Student student) {
        studentRepository.save(student);

    }

    @Override
    public Student findStudentById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public void displayAllStudents() {
        List<Student> students = studentRepository.findAll();
        for(Student student : students){
            System.out.println(student);
        }

    }
}
