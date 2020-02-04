package com.ui.cts;

import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cts.model.Course;
import com.cts.model.Trainee;

import model.cts.jpa.hib.demo.util.JPAUtil;

public class Example4OneToMany {
	public static void main(String[]args) {
		Course mca= new Course(101,"MCA",new TreeSet<Trainee>());
		Course mba= new Course(102,"MBA",new TreeSet<Trainee>());
		mca.getTrainees().add(new Trainee(210,"varun",mca));
		mca.getTrainees().add(new Trainee(211,"sheru",mca));
		mca.getTrainees().add(new Trainee(210,"alia",mca));
		
		mba.getTrainees().add(new Trainee(215, "Shradha",mba));
		mba.getTrainees().add(new Trainee(216, "Janani",mba));
		EntityManager em= JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		em.persist(mca);
		em.persist(mba);
		txn.commit();
	}
}
