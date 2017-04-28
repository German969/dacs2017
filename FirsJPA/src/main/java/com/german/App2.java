package com.german;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App2 {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.persistencia");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();

		Person p1 = new Person("Kevin","kevin@gmail.com");
		Person p2 = new Person("Joe","joe@gmail.com");

		entityManager.persist(p1);
		entityManager.persist(p2);
		
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();

	}
}
