package org.example.service;

import org.example.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceMock implements StudentService{

    private final List<Student> studentList;

    public StudentServiceMock(){

        //initialisation avec des donnees fictives

        studentList = new ArrayList<>();
        studentList.add(new Student(1, "Mock Student 1"));
        studentList.add(new Student(1, "Mock Student 2"));
        studentList.add(new Student(1, "Mock Student 3"));

    }
    @Override
    public void createStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public Student findStudentById(int id) {
        for(Student student : studentList){
            if(student.getId()==id){
                return student;
            }
        }
        return null;// si l etudiant n est pas trouve
    }

    @Override
    public void displayAllStudents() {
        //affichage des etudiants
        for(Student student : studentList ){
            System.out.println(student);
        }

    }
}
