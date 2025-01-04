package org.example.Service;

import org.example.entity.Gender;
import org.example.entity.Student;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;


class StudentServiceTest {

    @Test
    void saveStudent() {

        Student student = new Student();
        student.setStudentNumber("1");
        student.setBirthDate(LocalDate.of(1990, 2, 2));
        student.setGender(Gender.male);
        student.setFirstName("John");
        student.setLastName("Doe");
        student.setHasDormitory(false);
        student.setMarried(false);
        student.setKartBankiDetails(null);
    }
}