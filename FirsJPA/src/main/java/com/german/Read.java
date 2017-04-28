package com.german;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Read {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.persistencia");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();

		Person p = entityManager.find(Person.class, 2);
		System.out.println(p);

		entityManager.close();
		entityManagerFactory.close();

	}
}
