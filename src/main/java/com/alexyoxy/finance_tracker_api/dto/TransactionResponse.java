package com.alexyoxy.finance_tracker_api.dto;

import com.alexyoxy.finance_tracker_api.entity.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record TransactionResponse(
        Long id,
        BigDecimal amount,
        TransactionType type,
        String category,
        String description,
        LocalDate transactionDate,
        LocalDateTime createdAt
) {
}
