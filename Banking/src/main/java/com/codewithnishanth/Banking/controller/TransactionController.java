package com.codewithnishanth.Banking.controller;

import com.codewithnishanth.Banking.model.Account;
import com.codewithnishanth.Banking.model.Transaction;
import com.codewithnishanth.Banking.service.AccountService;
import com.codewithnishanth.Banking.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transaction")
@CrossOrigin
public class TransactionController {
    @Autowired
    private AccountService accountService;

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/history/{accountId}")
    public ResponseEntity<Object> getTransactionHistory(@PathVariable Long accountId) {
        List<Transaction> transactionHistory = transactionService.getTransactionHistory(accountId);
        return ResponseEntity.ok().body(transactionHistory);
    }
}
