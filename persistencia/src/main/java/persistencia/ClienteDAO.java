package persistencia;
 
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
 
@Stateless
public class ClienteDAO {
    // Injected database connection:
    @PersistenceContext private EntityManager em;
 
    // Stores a new guest:
    public void persist(Cliente cliente) {
        em.persist(cliente);
    }
}