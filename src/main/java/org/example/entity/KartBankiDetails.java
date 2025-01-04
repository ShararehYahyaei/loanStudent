package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KartBankiDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Enumerated(EnumType.STRING)
    KartBanki banki;
    String cvv2;
    LocalDate expiryDate;

    public KartBankiDetails(KartBanki kartBanki, String number, LocalDate of) {
        this.banki = kartBanki;
        this.cvv2 = number;
        this.expiryDate = of;
    }
}


