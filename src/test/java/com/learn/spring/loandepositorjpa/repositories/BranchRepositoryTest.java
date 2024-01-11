package com.learn.spring.loandepositorjpa.repositories;

import com.learn.spring.loandepositorjpa.entities.Account;
import com.learn.spring.loandepositorjpa.entities.AccountType;
import com.learn.spring.loandepositorjpa.entities.Branch;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BranchRepositoryTest {

    @Autowired
    private BranchRepository branchRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private LoanRepository loanRepository;


    @Test
    public void saveAccount(){
        Branch branch = Branch.builder()
                .state("s")
                .city("djka")
                .branchName("Bname")
                .district("district")
                .location("zyx")
                .build();

        Account account = Account.builder()
                .accountType(AccountType.current)
                .branch(branch)
                .balance(0.0F)
                .creationDate(LocalDate.now())
                .build();

        accountRepository.save(account);

    }

}