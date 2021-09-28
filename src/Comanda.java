import java.util.LinkedList;
import java.util.List;

public class Comanda {

    private List<ElementComanda> llistaCompra;
    private int preuTotal;

    public Comanda(){ // Constructor

        this.llistaCompra = new LinkedList<ElementComanda>();
        this.preuTotal = 0;

    }


    // method per afegir element a la llista compra
    // method per retornar el preu total
    // method per retornar la llista compra

    public static class ElementComanda{

        private Producto producte;
        private int quantitat;

        // method per afegir una venta a producte
        // method per retornar producto
        // method per retornar quantitat
        // constructor
        // method per afegir quantitat


    }

    public static void main(String[] args) {
        Manager g = ... new ProductManagerImpl();

        g.addProduct("cafe", 2);
        g.addUser("33333", "toni", ..)

        Pedido p = new Pedido("3333");
        p.addLP(3, "donnuts");
        p.addLP(4, "cafe");

        g.addOrder(p);


    }



}
