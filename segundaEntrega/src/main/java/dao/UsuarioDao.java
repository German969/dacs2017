package dao;

import java.util.List;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import entities.Usuario;
import entities.Usuario_;

@Stateful
public class UsuarioDao {

	@PersistenceContext(type = PersistenceContextType.EXTENDED)
	private EntityManager em;
	
	public void create(Usuario u) {

		try {
			em.persist(u);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Usuario> getUsuarios() {

		CriteriaBuilder builder = em.getCriteriaBuilder();

		CriteriaQuery<Usuario> query = builder.createQuery(Usuario.class);

		query.from(Usuario.class);

		TypedQuery<Usuario> typedQuery = em.createQuery(query);

		return typedQuery.getResultList();

	}
	
	public List<Usuario> getByName(String name){
		
		CriteriaBuilder builder = em.getCriteriaBuilder();

		CriteriaQuery<Usuario> query = builder.createQuery(Usuario.class);

		Root<Usuario> root = query.from(Usuario.class);

		Predicate p = builder.like(root.get(Usuario_.nombre), "%"+name+"%");

		query.where(p);

		TypedQuery<Usuario> typedQuery = em.createQuery(query);

		List<Usuario> rl = typedQuery.getResultList();

		return rl;
		
	}
	
	public void update(Usuario u) {

		em.merge(u);

	}
	
	public void delete(Usuario u){
		
		em.remove(u);
		
	}
	
}
