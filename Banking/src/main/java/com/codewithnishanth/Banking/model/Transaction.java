package com.codewithnishanth.Banking.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Transaction extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Long accountId;
    private double creditAmount;
    private double debitAmount;
    private double balance;
}
