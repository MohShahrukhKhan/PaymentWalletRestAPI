package com.masai.service;

import java.util.List;

import com.masai.model.BeneficiaryDetails;
import com.masai.model.Customer;

public interface BenificiaryService {
	public BeneficiaryDetails addBenificiary(BeneficiaryDetails bd);
	public BeneficiaryDetails deleteBenificiary(BeneficiaryDetails bd);
	public BeneficiaryDetails viewBenificiary(String mobNo);
	public List<BeneficiaryDetails> viewAllBenificiary(Customer customer);
}
