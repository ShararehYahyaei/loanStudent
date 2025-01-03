package org.example.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class KartBankiDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Enumerated(EnumType.STRING)
    KartBanki banki;
    String cvv2;
    LocalDate expiryDate;
    @OneToOne(mappedBy = "kartBankiDetails")
    private Student student;

}



