package com.example.tuto.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

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
