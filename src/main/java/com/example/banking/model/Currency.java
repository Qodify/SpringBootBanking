package com.example.banking.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "CURRENCY_CODE")
    private String code;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SIGN")
    private String sign;
}
