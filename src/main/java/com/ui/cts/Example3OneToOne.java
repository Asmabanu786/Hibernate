package com.ui.cts;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.cts.model.BankAccount;
import com.cts.model.*;

import model.cts.jpa.hib.demo.util.JPAUtil;


public class Example3OneToOne {

	public static void main(String[] args) {
		BankAccount ba= new BankAccount();
		Customer cs= new Customer("100090876", "Raj", ba);
		ba.setAccno("SB00056");
		ba.setCustomer(cs);
		EntityManager em= JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn= em.getTransaction();
		txn.begin();
		em.persist(cs);
		txn.commit();
		JPAUtil.shutdown();
	}

}
