import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ManagerTest {

    @Before
    public void SetUp(){
        Manager manager = new ManagerImpl();

        Producto cafe = new Producto("Cafe",0.8);
        Producto cheesecake = new Producto("Cheese Cake",2.5);
        Producto croissant = new Producto("Croissant",1.2);
        Producto sucdetaronja = new Producto("Suc de taronja",4.1);
        Producto donut = new Producto("Donut",1.30);

        manager.añadirProductoLista(cafe);
        manager.añadirProductoLista(cheesecake);
        manager.añadirProductoLista(croissant);
        manager.añadirProductoLista(sucdetaronja);
        manager.añadirProductoLista(donut);

        Comanda comanda = new Comanda("2222222X");
        comanda.addLP(2, "Donut");
        comanda.addLP(1, "Cafe");

        manager.realizarPedido(comanda);

        manager.servirPedido();

        List<Comanda> miLista = manager.listadoPedidosUser("222222X");

        List<Producto> miLista2 = manager.ordenarProductosVentas();

    }

    @Test
    public void FerComanda(){
        Assert.
    }
}
