package com.learn.spring.loandepositorjpa.repositories;

import com.learn.spring.loandepositorjpa.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
