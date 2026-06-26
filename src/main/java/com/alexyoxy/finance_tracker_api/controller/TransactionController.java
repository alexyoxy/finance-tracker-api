package com.alexyoxy.finance_tracker_api.controller;

import com.alexyoxy.finance_tracker_api.dto.CreateTransactionRequest;
import com.alexyoxy.finance_tracker_api.dto.TransactionResponse;
import com.alexyoxy.finance_tracker_api.service.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    public List<TransactionResponse> getAll() {
        return transactionService.findAll();
    }

    @PostMapping
    public TransactionResponse create(@RequestBody CreateTransactionRequest request) {
        return transactionService.create(request);
    }
}
