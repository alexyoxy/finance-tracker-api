package com.alexyoxy.finance_tracker_api.repository;

import com.alexyoxy.finance_tracker_api.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
