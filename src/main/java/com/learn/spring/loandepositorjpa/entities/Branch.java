package com.learn.spring.loandepositorjpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Branch {

    @Id
    @SequenceGenerator(
            name = "branch_sequence",
            sequenceName = "branch_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "branch_sequence"
    )
    private Long branchId;

    @Column(
            name = "branch_name",
            nullable = false
    )
    private String branchName;

    @Column(
            name = "branch_location",
            nullable = false
    )
    private String location;

    @Column(
            name = "branch_city",
            nullable = false
    )
    private String city;

    @Column(
            name = "branch_district",
            nullable = false
    )
    private String district;

    @Column(
            name = "branch_state",
            nullable = false
    )
    private String state;

    @OneToMany(
            cascade = CascadeType.ALL
    )
    private List<Loan> loan = new ArrayList<>();

}
