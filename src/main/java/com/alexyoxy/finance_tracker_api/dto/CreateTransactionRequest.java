package com.alexyoxy.finance_tracker_api.dto;

import com.alexyoxy.finance_tracker_api.entity.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDate;

public record CreateTransactionRequest(
    BigDecimal amount,
    TransactionType type,
    String category,
    String description,
    LocalDate transactionDate
) {
}
