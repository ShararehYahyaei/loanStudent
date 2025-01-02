package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.PackagePrivate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@PackagePrivate
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    LoanType loanType;
    double loanAmount;
    PaymentType paymentType;
}
