package com.masai.service;

import com.masai.model.Customer;

public interface UserService {
	public Customer validateLogin(String moblieNumber,String password);

}
