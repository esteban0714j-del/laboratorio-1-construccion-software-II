package session;

import entity.Producto;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class ProductoFacade {

    @PersistenceContext(unitName = "restaurantePU")
    private EntityManager em;

    public List<Producto> findAll() {
        return em.createQuery("SELECT p FROM Producto p").getResultList();
    }
}
