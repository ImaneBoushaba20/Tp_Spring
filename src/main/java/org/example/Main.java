package org.example;

import org.example.Config.ApplicationConfig;
import org.example.model.Student;
import org.example.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        // Récupérer le bean StudentService
        StudentService studentService = context.getBean(StudentService.class);

        // Utiliser les méthodes appropriées
        studentService.createStudent(new Student(1, "Imane"));
        studentService.createStudent(new Student(2, "Alice"));
        studentService.createStudent(new Student(3, "Mohammed"));
        studentService.displayAllStudents();
    }
}