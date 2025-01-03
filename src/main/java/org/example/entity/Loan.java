package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.PackagePrivate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@PackagePrivate
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Enumerated(EnumType.STRING)
    LoanType loanType;
    BigDecimal loanAmount;
    @Enumerated(EnumType.STRING)
    PaymentType paymentType;
    LocalDate dueDate;
    @OneToMany(mappedBy = "loan")
    List<Student> students;
}
