import org.junit.Before;
import org.junit.Test;

public class ManagerTest {

    @Before
    public static void main(String[] args) {
        Manager manager = new ManagerImpl();

        // manager.addProduct("donut", "dddd", 2);

        // manager.addUser("22222222X", "Aida");
        RedVelvet redVelvet = new RedVelvet();
        Cafe cafe_latte = new Cafe();
        Usuari Jordi = new Usuari("Jordi","48144497X");
        Comanda comanda = new Comanda(Jordi);
        manager.añadirProductoLista(redVelvet);
        manager.añadirProductoLista(cafe_latte);
        manager.añadirUsuario(Jordi);
        comanda.addLP(2, redVelvet);
        comanda.addLP(1,cafe_latte);
        manager.realizarPedido(comanda,Jordi);
        manager.servirPedido();

        //Fins aquest punt, es pot fer una comanda i servirla

    }
    public void SetUp() throws EmptyList {
        Manager manager = new ManagerImpl();

        // manager.addProduct("donut", "dddd", 2);

        // manager.addUser("22222222X", "Aida");
        RedVelvet redVelvet = new RedVelvet();
        Cafe cafe_latte = new Cafe();
        Usuari Jordi = new Usuari("Jordi","48144497X");
        Comanda comanda = new Comanda(Jordi);
        comanda.addLP(2, redVelvet);
        comanda.addLP(1,cafe_latte);
        manager.realizarPedido(comanda, Jordi);
        manager.servirPedido();

        manager.realizarPedido(comanda, Jordi);
        manager.servirPedido(); //Apuntem la venta i va creant la llista de comandes
        //List<Comanda> miLista = new List<Comanda>();
        //miLista=manager.listadoPedidosUser("222222X"); //Ens retorna la llista de comandes del usuari

        //List<Producto> miLista2 = new List<Producto>();
        //miLista2=manager.ordenarProductosVentas();

    }

    @Test
    public void ProbaComanda(){

    }
}
