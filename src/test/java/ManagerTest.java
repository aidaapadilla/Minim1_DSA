import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class ManagerTest {
    ManagerImpl manager;
    Comanda comanda;

    @Before
    public void setUp  () {
        manager = new ManagerImpl();
        manager.añadirUsuario(new Usuari("Joana","22222222X"));
        manager.añadirUsuario(new Usuari("Jordi","33333333Y"));
        manager.añadirUsuario(new Usuari("Aida","11111111Z"));

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

        comanda = new Comanda("11111111Z");
        comanda.addLP(2, donut);
        comanda.addLP(1, cafe);
        comanda.addLP(4,croissant);

        manager.realizarPedido(comanda);
    }
    public static void main(String[] args) {
        ManagerImpl manager;
        Comanda comanda;
        manager = new ManagerImpl();
        manager.añadirUsuario(new Usuari("Joana","22222222X"));
        manager.añadirUsuario(new Usuari("Jordi","33333333Y"));
        manager.añadirUsuario(new Usuari("Aida","11111111Z"));

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

        comanda = new Comanda("11111111Z");
        comanda.addLP(2, donut);
        comanda.addLP(1, cafe);
        comanda.addLP(4,croissant);

        manager.realizarPedido(comanda);

        Comanda comanda2 = new Comanda("22222222X");
        comanda2.addLP(1,croissant);
        comanda2.addLP(1,cafe);

        manager.realizarPedido(comanda2);

        Comanda comanda3 = new Comanda("33333333Y");
        comanda3.addLP(1,cheesecake);
        comanda3.addLP(1,sucdetaronja);

        manager.realizarPedido(comanda3);

        manager.servirPedido();
        manager.servirPedido();

        Comanda comanda4 = new Comanda("11111111Z");
        comanda4.addLP(2,donut);
        comanda4.addLP(2,sucdetaronja);
        manager.realizarPedido(comanda4);

        manager.servirPedido();
        manager.servirPedido();

        List<Producto> miListaOrdenadaPrecio = manager.ordenarProductosPrecio();
        List<Producto> miListaOrdenadaVentas = manager.ordenarProductosVentas();
        List<Comanda> miListaPedidosUsuario = manager.listadoPedidosUser("11111111Z");

    }

    @Test
    public void ProbaServirPedido(){
        Assert.assertEquals(comanda.getUsuariID(),"11111111Z");     //Fa una comanda
        Assert.assertEquals(manager.GetNumComandes(),1);            //Mirem si s'ha afegit
        manager.servirPedido();                                           //Li donem el seu menjar
        Assert.assertEquals(manager.GetNumComandes(),0);            //Mirem si s'ha borrat de les comandes

        List<Comanda> comandas_1 = new LinkedList<>();                    //
        Comanda miComanda = new Comanda("11111111Z");
        comandas_1.add(miComanda);
        Assert.assertEquals(manager.listadoPedidosUser("11111111Z"),comandas_1);

        List<Producto> misProductos = new LinkedList<>();
        Producto cafe = new Producto("Cafe",0.8); //1r
        Producto cheesecake = new Producto("Cheese Cake",2.5); //3r
        Producto croissant = new Producto("Croissant",1.2); //2n
        misProductos.add(cafe);
        misProductos.add(croissant);
        misProductos.add(cheesecake);

        Assert.assertEquals(manager.ordenarProductosPrecio(),misProductos);
        miComanda.addLP(3,cafe);
        miComanda.addLP(1,cheesecake);
        miComanda.addLP(2,croissant);
        List<Producto> misProductos2 = new LinkedList<>();
        misProductos2.add(cheesecake);
        misProductos2.add(croissant);
        misProductos2.add(cafe);
        Assert.assertEquals(manager.ordenarProductosVentas(),misProductos2);
    }


}
