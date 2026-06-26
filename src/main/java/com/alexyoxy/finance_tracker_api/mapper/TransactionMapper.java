package com.alexyoxy.finance_tracker_api.mapper;

import com.alexyoxy.finance_tracker_api.dto.CreateTransactionRequest;
import com.alexyoxy.finance_tracker_api.dto.TransactionResponse;
import com.alexyoxy.finance_tracker_api.entity.Transaction;
import org.springframework.stereotype.Component;

@Component
public class TransactionMapper {
    public Transaction toEntity(CreateTransactionRequest request) {
        Transaction transaction = new Transaction();

        transaction.setAmount(request.amount());
        transaction.setType(request.type());
        transaction.setCategory(request.category());
        transaction.setDescription(request.description());
        transaction.setTransactionDate(request.transactionDate());

        return transaction;
    }

    public TransactionResponse toResponse(Transaction transaction) {
        return new TransactionResponse(
                transaction.getId(),
                transaction.getAmount(),
                transaction.getType(),
                transaction.getCategory(),
                transaction.getDescription(),
                transaction.getTransactionDate(),
                transaction.getCreatedAt()
        );
    }
}
