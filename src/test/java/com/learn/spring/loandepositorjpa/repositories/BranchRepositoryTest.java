package com.learn.spring.loandepositorjpa.repositories;

import com.learn.spring.loandepositorjpa.entities.Account;
import com.learn.spring.loandepositorjpa.entities.AccountType;
import com.learn.spring.loandepositorjpa.entities.Branch;
import com.learn.spring.loandepositorjpa.entities.Loan;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

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

    @Test
    public void saveLoan(){
        Loan loan = Loan.builder()
                .amount(23000L)
                .branch(branchRepository.findById(1L).get())
                .build();

        loanRepository.save(loan);
    }

    public void saveDepositor(){

    }


    @Test
    public void getLoanersAndAccounts(){
        List<?> l = branchRepository.findById(1L).get().getLoans();
        System.out.println("l = " + l);

        List<?> a = branchRepository.findById(1L).get().getAccounts();
        System.out.println("a = " + a);
    }

}