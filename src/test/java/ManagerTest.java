import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ManagerTest {

    @Before
    public void SetUp(){
        Manager manager = new ManagerImpl();

        // manager.addProduct("donut", "dddd", 2);

        // manager.addUser("22222222X", "Aida");

        Comanda comanda = new Comanda("2222222X");
        comanda.addLP(2, "donut");
        comanda.addLP(1,"cafe latte");

        manager.realizarPedido(comanda);
        manager.servirPedido(); //Apuntem la venta i va creant la llista de comandes
        List<Comanda> miLista = new List<Comanda>();
        miLista=manager.listadoPedidosUser("222222X"); //Ens retorna la llista de comandes del usuari

        List<Producto> miLista2 = new List<Producto>();
        miLista2=manager.ordenarProductosVentas();

    }

    @Test
    public void FerComanda(){
        Assert.
    }
}
