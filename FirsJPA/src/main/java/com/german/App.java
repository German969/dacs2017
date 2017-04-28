package com.german;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import javax.persistence.PersistenceContext;

public class App {
	
//	@PersistenceContext(unitName="com.persistencia") --->> otra forma (no me funcionó)
//	private static EntityManager entityManager;
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.persistencia");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		Student s = new Student("Cin",21,"España 1100");
//		s.setAge(28);
//		s.setName("Jorge");
		
		entityManager.persist(s);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
	}
}
