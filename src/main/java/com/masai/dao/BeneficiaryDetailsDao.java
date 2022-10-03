package com.masai.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.BeneficiaryDetails;

@Repository
public interface BeneficiaryDetailsDao extends JpaRepository<BeneficiaryDetails, String>{

}
