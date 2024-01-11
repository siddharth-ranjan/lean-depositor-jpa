package com.learn.spring.loandepositorjpa.repositories;

import com.learn.spring.loandepositorjpa.entities.Depositor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepositorRepository extends JpaRepository<Depositor, Long> {
}
