import org.junit.Before;
import org.junit.Test;
import java.util.*;

import java.util.Queue;

public class ManagerTest {

    public static void main(String[] args) {

        ManagerImpl manager = new ManagerImpl();
        manager.añadirUsuario(new Usuari("Joana","2222222X"));
        manager.añadirUsuario(new Usuari("Jordi","3333333Y"));
        manager.añadirUsuario(new Usuari("Aida","1111111Z"));

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
        comanda.addLP(4,"Croissant");

        manager.realizarPedido(comanda);

        Comanda comanda2 = new Comanda("2222222X");
        comanda2.addLP(1,"Croissant");
        comanda2.addLP(1,"Cafe");

        manager.realizarPedido(comanda2);

        Comanda comanda3 = new Comanda("3333333Y");
        comanda3.addLP(1,"Cheese Cake");
        comanda3.addLP(1,"Suc de taronja");

        manager.realizarPedido(comanda3);

        manager.servirPedido();
        manager.servirPedido();

        Comanda comanda4 = new Comanda("1111111Z");
        comanda4.addLP(2,"Donut");
        comanda4.addLP(2,"Suc de taronja");

        manager.servirPedido();

        List<Producto> miListaOrdenadaPrecio = manager.ordenarProductosPrecio();
        List<Producto> miListaOrdenadaVentas = manager.ordenarProductosVentas();

    }


}
