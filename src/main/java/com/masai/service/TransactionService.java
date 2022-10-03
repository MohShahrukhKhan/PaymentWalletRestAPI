package com.masai.service;

import java.time.LocalDate;
import java.util.List;

import com.masai.model.Transaction;
import com.masai.model.Wallet;

public interface TransactionService {
	public Transaction addTransaction(Transaction tran);
	public List<Transaction> viewAllTransactions(Wallet wallet);
	public List<Transaction> viewTransactionsByDate(LocalDate from,LocalDate to);
	public List<Transaction> viewAllTransactions(String Type);

}
