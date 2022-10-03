package com.masai.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.BillPayment;

public interface BillPaymentDao extends JpaRepository<BillPayment, Integer> {

}
