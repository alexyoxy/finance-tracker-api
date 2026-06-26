package com.alexyoxy.finance_tracker_api.dto;

import com.alexyoxy.finance_tracker_api.entity.TransactionType;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public record CreateTransactionRequest(
        @NotNull
        @DecimalMin(value = "0.01")
        BigDecimal amount,

        @NotNull
        TransactionType type,

        @NotBlank
        String category,

        String description,

        @NotNull
        LocalDate transactionDate
) {
}
