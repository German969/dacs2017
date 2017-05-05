package pruebas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Read {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.persistencia");

	public static void main(String args[]) {

		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
	
//		Person p = entityManager.find(Person.class, 2);
//		System.out.println(p);
		
		em.close();
		
	}
		
}
