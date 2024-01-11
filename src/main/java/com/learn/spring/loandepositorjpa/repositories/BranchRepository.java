package com.learn.spring.loandepositorjpa.repositories;

import com.learn.spring.loandepositorjpa.entities.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Long> {
}
