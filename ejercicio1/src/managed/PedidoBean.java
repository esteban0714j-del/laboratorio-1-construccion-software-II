package managed;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.ejb.EJB;
import java.io.Serializable;
import java.util.List;

import entity.Producto;
import session.ProductoFacade;

@Named("pedidoBean")
@SessionScoped
public class PedidoBean implements Serializable {

    @EJB
    private ProductoFacade productoFacade;

    public List<Producto> getProductos() {
        return productoFacade.findAll();
    }
}
