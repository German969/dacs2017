package com.german;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Delete {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.persistencia");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();

		Person p = entityManager.find(Person.class, 1);
		entityManager.remove(p);
		
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();

	}
}
