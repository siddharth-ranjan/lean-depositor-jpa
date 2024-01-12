package com.learn.spring.loandepositorjpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Loan {

    @Id
    @SequenceGenerator(
            name = "loan_sequence",
            sequenceName = "loan_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "loan_sequence"
    )
    private Long loan_no;

    @Column(
            nullable = false,
            name = "loan_amount"
    )
    private Long amount;

    @ManyToOne(
//            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "branch_id"
    )
    private Branch branch;

    @Override
    public String toString() {
        return "Loan{" +
                "loan_no=" + loan_no +
                ", amount=" + amount +
                ", branch=" + branch.getBranchId() +
                '}';
    }
}
