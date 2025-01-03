package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.PackagePrivate;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@PackagePrivate
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String firstName;
    String lastName;
    String nationalCode;
    LocalDate birthDate;
    String studentNumber;
    boolean isMarried;

    @Enumerated(EnumType.STRING)
    Gender gender;

    @Enumerated(EnumType.STRING)
    MaghtaTahsili maghtaTahsili;

    @ManyToOne
    @JoinColumn(name = "loan_id")
    private Loan loan;

    @OneToOne(cascade = CascadeType.ALL)
    KartBankiDetails kartBankiDetails;
    @ManyToOne
    @JoinColumn(name = "university_id")
    private University university;

    Boolean hasDormitory;

    @OneToOne
    @JoinColumn(name = "kart_banki_id")
    KartBankiDetails kartBankiDetail;



}
