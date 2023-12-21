package com.codewithnishanth.Banking.service;

import com.codewithnishanth.Banking.model.Account;
import com.codewithnishanth.Banking.model.Transaction;
import com.codewithnishanth.Banking.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction createTransaction(Account account, double creditAmount, double debitAmount, double balance) {
        Transaction transaction = new Transaction();
        transaction.setAccountId(account.getId());
        transaction.setCreditAmount(creditAmount);
        transaction.setDebitAmount(debitAmount);
        transaction.setBalance(balance);
        return transactionRepository.save(transaction);
    }

    public List<Transaction> getTransactionHistory(Long accountId) {
        return transactionRepository.findByAccountId(accountId);
    }
}
