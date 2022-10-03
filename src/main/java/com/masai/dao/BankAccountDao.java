package com.masai.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.BankAccount;

public interface BankAccountDao extends JpaRepository<BankAccount, Integer>{

}
