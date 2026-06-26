package com.alexyoxy.finance_tracker_api.service;

import com.alexyoxy.finance_tracker_api.dto.CreateTransactionRequest;
import com.alexyoxy.finance_tracker_api.entity.Transaction;
import com.alexyoxy.finance_tracker_api.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public List<Transaction> findAll() {
        return transactionRepository.findAll();
    }

    public Transaction create(CreateTransactionRequest request) {

        Transaction transaction = new Transaction();

        transaction.setAmount(request.amount());
        transaction.setType(request.type());
        transaction.setCategory(request.category());
        transaction.setDescription(request.description());
        transaction.setTransactionDate(request.transactionDate());

        return transactionRepository.save(transaction);
    }
}
