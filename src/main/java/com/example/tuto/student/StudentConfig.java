package com.example.tuto.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student john = new Student(
                    "John",
                    "john.smith@email.com",
                    LocalDate.of(2002, JUNE, 19),
                    21
            );

            Student tony = new Student(
                    "Tony",
                    "tony.stark@email.com",
                    LocalDate.of(1998, NOVEMBER, 25),
                    25
            );

            repository.saveAll(
                    List.of(john, tony)
            );
        };
    }
}
