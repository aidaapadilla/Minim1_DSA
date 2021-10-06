import org.junit.Before;
import org.junit.Test;

public class ManagerTest {

    @Before
    public static void main(String[] args) {
        Manager manager = new ManagerImpl();
        RedVelvet redVelvet = new RedVelvet();
        Cafe cafe_latte = new Cafe();
        Vurger vurger_cangrevurger = new Vurger();
        Usuari Jordi = new Usuari("Jordi","48144497X");
        manager.añadirUsuario(Jordi);
        Usuari Joana = new Usuari("Joana", "77516325Z");
        manager.añadirUsuario(Joana);
        manager.añadirProductoLista(redVelvet);
        manager.añadirProductoLista(cafe_latte);
        manager.añadirProductoLista(vurger_cangrevurger);
        Comanda comanda1jordi = new Comanda(Jordi);
        comanda1jordi.addLP(2, redVelvet);
        comanda1jordi.addLP(1, cafe_latte);
        Comanda comanda1joana = new Comanda(Joana);
        comanda1joana.addLP(1, redVelvet);
        comanda1joana.addLP(1, cafe_latte);
        comanda1joana.addLP(3, vurger_cangrevurger);

        manager.realizarPedido(comanda1jordi,Jordi);
        manager.realizarPedido(comanda1joana,Joana);
        manager.servirPedido();
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

        //Producto cafe = new Producto("Cafe",0.8);
        //Producto cheesecake = new Producto("Cheese Cake",2.5);
        //Producto croissant = new Producto("Croissant",1.2);
        //Producto sucdetaronja = new Producto("Suc de taronja",4.1);
        //Producto donut = new Producto("Donut",1.30);

        //manager.añadirProductoLista(cafe);
        //manager.añadirProductoLista(cheesecake);
        //manager.añadirProductoLista(croissant);
        //manager.añadirProductoLista(sucdetaronja);
        //manager.añadirProductoLista(donut);

        //Comanda comanda = new Comanda("2222222X");
        //comanda.addLP(2, "Donut");
        //comanda.addLP(1, "Cafe");

        //manager.realizarPedido(comanda);

        //manager.servirPedido();

        //List<Comanda> miLista = manager.listadoPedidosUser("222222X");

        //List<Producto> miLista2 = manager.ordenarProductosVentas();

    }

    @Test
    public void FerComanda(){
    }
}
