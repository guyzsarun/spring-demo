package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student test1 = new Student(
                    "test1",
                    "test1@gmail.com",
                    LocalDate.of(2000, Month.DECEMBER, 30));


            Student test2 = new Student(
                    "test2",
                    "test2@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 27));
            repository.saveAll(
                    List.of(test1, test2)
            );
        };
    }
}
