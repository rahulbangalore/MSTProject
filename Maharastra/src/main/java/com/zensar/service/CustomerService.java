package com.zensar.service;

import java.util.List;

import com.zensar.entities.Customer;

public interface CustomerService {

    void addCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void removeCustomer(Customer customer);
    List<Customer> findAllCustomer();
    Customer findCustomerById(int customerId);
    List<Customer> getCustomerByEmail(String emailId);
	/*
	 * public boolean checkLogin(String emailId,String password); public boolean
	 * checkIfUserExists(String emailId); public boolean resetPassword(String
	 * emailId,String newPassword);
	 */
}
