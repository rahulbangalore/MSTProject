package com.zensar.dao;

import java.util.List;

import com.zensar.entities.Customer;

public interface CustomerDao {

	void insert(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	Customer getById(int customerId);
	List<Customer> getAll();
}
