import java.util.LinkedList;
import java.util.List;

public class Comanda {

    private String usuari;
    private List<Producto> llistaCompra;
    private int preuTotal;


    public Comanda(String user){ // Constructor
        this.usuari = user;
        this.llistaCompra = new LinkedList<ElementComanda>();
        this.preuTotal = 0;
    }

    public void addLP(int quantitat, string usuari){

    }

    // method per afegir element a la llista compra
    // method per retornar el preu total
    // method per retornar la llista compra

/*
    public static class ElementComanda{

        private Producto producte;
        private int quantitat;

        // method per afegir una venta a producte
        // method per retornar producto
        // method per retornar quantitat
        // constructor
        // method per afegir quantitat


    }
    */


}
