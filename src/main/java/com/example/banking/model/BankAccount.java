package com.example.banking.model;

import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Table(name = "BANKACCOUNT")
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BANKACCOUNT_ID")
    private Long id;

    @Column(name = "IBAN")
    private String IBAN;

    @Column(name = "PROVIDER")
    private String provider; //ING

    @Column(name = "BALANCE")
    private Double balance;

    @ManyToOne(optional = false)
    @JoinColumn(name = "CURRENCY_CODE")
    private Currency currency;

    @Setter
    @OneToOne(optional = true)
    @JoinColumn(name = "PERSON_ID")
    private BankAccount bankAccount;
}
