package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Kyoshi",
                        20,
                        LocalDate.of(2002, Month.JUNE,24),
                        "kyoshisew@gmail.com"

                )
        );
    }
}
