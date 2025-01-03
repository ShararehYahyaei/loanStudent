package org.example.entity;

import jakarta.persistence.*;
import org.example.entity.UniversityType;

import java.util.List;

@Entity
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String universityName;
    @Enumerated(EnumType.STRING)
    UniversityType universityType;

    @OneToMany(mappedBy = "university")
    private List<Student> students;

}
