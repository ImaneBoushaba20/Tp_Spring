package org.example.Config;

import org.example.repository.InMemoryStudentRepository;
import org.example.repository.StudentRepository;
import org.example.service.StudentService;
import org.example.service.StudentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ApplicationConfig {


    @Bean
    public StudentService studentService(StudentRepository studentRepository){
        return new StudentServiceImpl(studentRepository);
    }

    @Bean
    public InMemoryStudentRepository studentRepository(){
        return new org.example.repository.InMemoryStudentRepository();
    }


}
