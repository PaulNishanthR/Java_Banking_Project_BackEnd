package com.codewithnishanth.Banking.repository;

import com.codewithnishanth.Banking.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    boolean existsByAccountIdAndCreditAmountAndDebitAmountAndBalance(Long accountId, double creditAmount, double debitAmount, double balance);

    List<Transaction> findByAccountId(Long accountId);
}
