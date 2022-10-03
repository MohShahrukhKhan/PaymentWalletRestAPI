package com.masai.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class BankAccount {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer accountNo;
	private String ifscCode;
	private String Bankname;
	private double balance;
	private Wallet wallet;

}
