package pruebas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import primerEntrega.Producto;

public class Delete {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.persistencia");
	
	public static void main(String args[]) {

		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		
		Producto p = em.find(Producto.class, 1L);
		em.remove(p);
		
		em.getTransaction().commit();

		em.close();
		
	}
	
}
