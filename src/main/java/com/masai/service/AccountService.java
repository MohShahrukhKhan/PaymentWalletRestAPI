package com.masai.service;

import java.util.List;

import com.masai.model.BankAccount;
import com.masai.model.Wallet;

public interface AccountService {
	public Wallet addAccount(BankAccount bacc);
	public Wallet removeAccount(BankAccount bacc);
	public BankAccount viewAccount(Wallet wallet);
	public List<BankAccount> viewAllAccount(Wallet wallet);
}
