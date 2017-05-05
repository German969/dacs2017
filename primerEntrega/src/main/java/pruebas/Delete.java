package pruebas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Delete {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.persistencia");
	
	public static void main(String args[]) {

		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		
//		Person p = entityManager.find(Person.class, 1);
//		entityManager.remove(p);
		
		em.getTransaction().commit();

		em.close();
		
	}
	
}
