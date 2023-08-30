package com.example.tuto.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "John",
                        "john.smith@email.com",
                        LocalDate.of(2002, Month.JUNE, 19),
                        21
                )
        );
    }
}
