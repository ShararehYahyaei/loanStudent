package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.PackagePrivate;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@PackagePrivate
public class InformationKartbanki {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    KartBanki kartBankiName;
    String cvv2;
    LocalDate dateExpired;
}
