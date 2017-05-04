package pruebas;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import primerEntrega.Categoria;
import primerEntrega.Pedido;
import primerEntrega.Producto;
import primerEntrega.Proveedor;
import primerEntrega.Rol;
import primerEntrega.Usuario;

public class insertUsuario {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.persistencia"); 
	
	public static void main(String args[]){
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		//cargo roles
		Rol r1 = new Rol(1L, "Administrador");
		Rol r2 = new Rol(2L, "Cliente");
		em.persist(r1);
		em.persist(r2);
		
		//cargo usuarios
		Usuario u1 = new Usuario(1L, 36460763L, 4364607631L, "Dante René", "Sack", "3754-433234", 
				"N. Rojas Acosta n°564", "Resistencia", "Chaco", "Argentina", 3500, "sack_dante@hotmail.com", 
				"dante", "dante", r2);
		Usuario u2 = new Usuario(2L, 36460763L, 4364607631L, "Éner Etnad", "Kcas", "3754-433234", 
				"Nicolás R. Acosta n°465", "Aicnetsiser", "Ocahc", "Argentina", 3500, "sack.dante@gmail.com", 
				"etnad", "etnad", r2);
		em.persist(u1);
		em.persist(u2);

		//cargo pedidos
		Date fecha = new GregorianCalendar(2017, 04, 02).getTime();
		Pedido p1 = new Pedido(1L, fecha, "Pagado", (double)0, u1);
		Pedido p2 = new Pedido(2L, fecha, "Cancelado", (double)0, u1);
		Pedido p3 = new Pedido(3L, fecha, "Pendiente", (double)0, u1);
		Pedido p4 = new Pedido(4L, fecha, "Pagado", (double)0, u2);
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		
		//cargo categorias
		Categoria c1 = new Categoria(1L, "Cat1");
		Categoria c2 = new Categoria(2L, "Cat2");
		em.persist(c1);
		em.persist(c2);
		
		//cargo proveedores
		Proveedor pvd1 = new Proveedor(1L, "Proveedor A", "Argentina");
		Proveedor pvd2 = new Proveedor(2L, "Proveedor B", "Brasil");
		Proveedor pvd3 = new Proveedor(3L, "Proveedor C", "Colombia");
		em.persist(pvd1);
		em.persist(pvd2);
		em.persist(pvd3);
		
		//cargo productos		
		Producto pr1 = new Producto(1L, "Producto A", "Marca XYZ", null, 10, 0.1, 20, c1, pvd1);
		Producto pr2 = new Producto(2L, "Producto A", "Marca UVW", null, 12, 0.1, 25, c1, pvd2);
		Producto pr3 = new Producto(3L, "Producto A", "Marca XYZ", null, 9, 0.08, 20, c2, pvd3);
		Producto pr4 = new Producto(4L, "Producto D", "Marca XYZ", null, 26, 0.02, 50, c1, pvd1);
		Producto pr5 = new Producto(5L, "Producto E", "Marca UVW", null, 18, 0.05, 99, c1, pvd2);
		Producto pr6 = new Producto(6L, "Producto E", "Marca XYZ", null, 19, 0.05, 8, c2, pvd3);
		Producto pr7 = new Producto(7L, "Producto G", "Marca UVW", null, 120, 0.2, 4, c2, pvd3);
		Producto pr8 = new Producto(8L, "Producto H", "Marca DRS", null, 75, 0.08, 60, c2, pvd2);
		em.persist(pr1);
		em.persist(pr2);
		em.persist(pr3);
		em.persist(pr4);
		em.persist(pr5);
		em.persist(pr6);
		em.persist(pr7);
		em.persist(pr8);
		
		//cargo linea_pedido
		p1.getProductos().add(pr1);
		p1.getProductos().add(pr6);
		p1.getProductos().add(pr8);
		pr1.getPedidos().add(p1);
		pr6.getPedidos().add(p1);
		pr8.getPedidos().add(p1);
		
		p2.getProductos().add(pr5);
		p2.getProductos().add(pr6);
		p2.getProductos().add(pr2);
		pr5.getPedidos().add(p2);
		pr6.getPedidos().add(p2);
		pr2.getPedidos().add(p2);
		
		p3.getProductos().add(pr7);
		p3.getProductos().add(pr6);
		pr7.getPedidos().add(p3);
		pr6.getPedidos().add(p3);
		
		p4.getProductos().add(pr3);
		p4.getProductos().add(pr1);
		p4.getProductos().add(pr6);
		p4.getProductos().add(pr4);
		p4.getProductos().add(pr5);
		pr3.getPedidos().add(p4);
		pr1.getPedidos().add(p4);
		pr6.getPedidos().add(p4);
		pr4.getPedidos().add(p4);
		pr5.getPedidos().add(p4);
		
		em.getTransaction().commit();
		
		//em.close();
		
	}

}












