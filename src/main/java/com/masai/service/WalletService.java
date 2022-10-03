package com.masai.service;

import java.util.List;

import com.masai.model.Customer;
import com.masai.model.Wallet;

public interface WalletService {
	public Customer createAccount(String name,String moblieNo,double amount);
    public Customer showBalance(String moblieNo);
    public Customer fundTransfer(String sourceMoblieNo,String tergetMoblieNo,double amount);
    public Customer depositAmount(String moblieNo,double amount);
    public List<Customer> getList();
    public Customer updateAccount(Customer customer);
    public Customer addMoney(Wallet wallet,double amount);
}
