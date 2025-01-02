package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.PackagePrivate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@PackagePrivate
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String LastName;
    String fatherName;
    String motherName;
    String passportId;
    String nationalCode;
    String birthDate;
    String studentNumber;
    String universityName;
    UniversityType universityType;
    String yearStart;
    String userName;
    String password;
    GhaboliType ghaboliType;
    Gender gender;
    boolean isMarried;
    MaghtaTahsili maghtaTahsili;
    Boolean accommodation;


    public Student(String name, String lastName, String fathername, String motherName, String number1, String date, String number2, String payam, UniversityType universityType, String number3, String aaa, String number4, GhaboliType ghaboliType,
                   Gender gender, boolean b, MaghtaTahsili maghtaTahsili, boolean b1) {
        this.name = name;
        LastName = lastName;
        this.fatherName = fathername;
        this.motherName = motherName;
        this.passportId = number1;
        this.nationalCode = number2;
        this.birthDate = date;
        this.studentNumber = number3;
        this.universityType = universityType;
        this.yearStart = number4;
        this.gender = gender;
        this.isMarried = b;
        this.maghtaTahsili = maghtaTahsili;
        this.accommodation = b1;

    }
}
