package pruebas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import javax.persistence.PersistenceContext;
import primerEntrega.Usuario;

public class insertUsuario {
	
//	@PersistenceContext(unitName="com.persistencia") 
//	private static EntityManager entityManager;
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.persistencia");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		Usuario u1 = new Usuario();
		Usuario u2 = new Usuario();
		Usuario u3 = new Usuario();
		
		u1.setDni("12345678");
		u1.setNombre("Jorge");
		
		u2.setDni("87654321");
		u2.setNombre("Pedro");
		
		u3.setDni("11223344");
		u3.setNombre("Ana");
		
		entityManager.persist(u1);
		entityManager.persist(u2);
		entityManager.persist(u3);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
	}
}
