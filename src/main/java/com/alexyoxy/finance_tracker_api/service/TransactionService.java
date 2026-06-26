package com.alexyoxy.finance_tracker_api.service;

import com.alexyoxy.finance_tracker_api.dto.CreateTransactionRequest;
import com.alexyoxy.finance_tracker_api.dto.TransactionResponse;
import com.alexyoxy.finance_tracker_api.entity.Transaction;
import com.alexyoxy.finance_tracker_api.mapper.TransactionMapper;
import com.alexyoxy.finance_tracker_api.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    private final TransactionRepository transactionRepository;
    private final TransactionMapper transactionMapper;

    public TransactionService(
            TransactionRepository transactionRepository,
            TransactionMapper transactionMapper
    ) {
        this.transactionRepository = transactionRepository;
        this.transactionMapper = transactionMapper;
    }

    public List<TransactionResponse> findAll() {
        return transactionRepository.findAll()
                .stream()
                .map(transactionMapper::toResponse)
                .toList();
    }

    public TransactionResponse create(CreateTransactionRequest request) {

        Transaction transaction = transactionMapper.toEntity(request);
        Transaction savedTransaction = transactionRepository.save(transaction);

        return transactionMapper.toResponse(savedTransaction);
    }
}
