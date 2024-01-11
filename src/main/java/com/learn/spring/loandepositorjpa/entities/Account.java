package com.learn.spring.loandepositorjpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Account {

    @Id
    @SequenceGenerator(
            name = "account_sequence",
            sequenceName = "account_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "account_sequence"
    )
    @Column(
            name = "account_number"
    )
    private Long accountNumber;


    @Column(
            nullable = false
    )
    private Float balance;

    @Column(
            nullable = false,
            name = "creation_date"
    )
    private LocalDate creationDate;

    @Column(
            name = "account_type",
            nullable = false
    )
    private AccountType accountType;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "branch_id"
    )
    private Branch branch;
}
