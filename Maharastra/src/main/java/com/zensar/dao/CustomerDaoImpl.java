package com.zensar.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Customer;

public class CustomerDaoImpl implements CustomerDao {

	private Session session;

	public CustomerDaoImpl() {
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		session = factory.openSession();
	}

	public void insert(Customer customer) {
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		transaction.commit();
	}

	public void update(Customer customer) {
		Transaction transaction = session.beginTransaction();
		session.update(customer);
		transaction.commit();
	}

	public void delete(Customer customer) {
		Transaction transaction = session.beginTransaction();
		session.delete(customer);
		transaction.commit();
	}

	public Customer getById(int customerId) {
		return session.get(Customer.class, customerId);
	}

	public List<Customer> getAll() {
		session.createQuery("From customer");
		return session.createQuery("From customer").getResultList();
	}

	public Customer getUser(String emailAddress) {
		return session.get(Customer.class, emailAddress);
	}

}
