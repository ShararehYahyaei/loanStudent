package org.example.Service;

import org.example.entity.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;


class StudentServiceTest {
    StudentService studentService = new StudentService();

    @Test
    void saveStudent() {

        Student student = new Student();
        student.setStudentNumber("1");
        student.setBirthDate(LocalDate.of(1990, 2, 2));
        student.setGender(Gender.male);
        student.setFirstName("John");
        student.setLastName("Doe");
        student.setNationalCode("12345");
        student.setMaghtaTahsili(MaghtaTahsili.Kardani);
        University university = new University();
        university.setUniversityName("University");
        university.setUniversityType(UniversityType.AZAD_UNIVERSITY);
        student.setUniversity(university);
        student.setHasDormitory(false);
        student.setMarried(false);
        KartBankiDetails krt = new KartBankiDetails(KartBanki.MELLI, "332",
                LocalDate.of(2026, 3, 5));
        student.setKartBankiDetails(krt);
        Student studentResult = studentService.saveStudent(student);
        assertEquals("John", studentResult.getFirstName());

    }
}