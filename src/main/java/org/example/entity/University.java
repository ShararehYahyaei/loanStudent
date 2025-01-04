package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
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
