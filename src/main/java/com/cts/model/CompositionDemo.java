package com.cts.model;

import javax.persistence.EntityManager;

import com.cts.model.Address;
import com.cts.model.Faculty;

import model.cts.jpa.hib.demo.util.JPAUtil;


public class CompositionDemo {

	public static void main(String[]args) {
		Faculty f= new Faculty( "veera ",
				new Address("A210", "Serling Brookeside Apartments","Bangalore"));
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(f);
		em.getTransaction().commit();
		System.out.println("faculty Saved");
		JPAUtil.shutdown();
		
	}
}
