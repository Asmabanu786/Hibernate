
package com.ui.cts;

import javax.persistence.EntityManager;

import com.cts.model.Contract;
import com.cts.model.Emp;
import com.cts.model.Manager;

import model.cts.jpa.hib.demo.util.JPAUtil;


public class Examp {
	public static void main(String[]args) {
	Emp e= new Emp(201,"Sanu",25000);
	Manager m= new Manager(202, "Sony", 22000, 10000);
	Contract c= new Contract(203,"Mouni",250000, 25);
	EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
	em.getTransaction().begin();
	em.persist(e);
	em.persist(m);
	em.persist(c);
	em.getTransaction().commit();
	System.out.println("saved successfully");
	JPAUtil.shutdown();

}
}
