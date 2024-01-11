package com.learn.spring.loandepositorjpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Depositor {

    @Id
    @SequenceGenerator(
            name = "depositor_sequence",
            sequenceName = "depositor_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "depositor_sequence"
    )
    @Column(
            name = "depositor_id"
    )
    private Long depositorId;

    @Column(
            name = "full_name",
            nullable = false
    )
    private String fullName;

    @Column(
            nullable = false
    )
    private String contact;

    @Column(
            nullable = false
    )
    private String email;

}
