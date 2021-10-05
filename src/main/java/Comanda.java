import java.util.LinkedList;
import java.util.List;

public class Comanda {

    private String usuari;
    private List<ElementComanda> llistaCompra;
    private int preuTotal;


    public Comanda(String user) { // Constructor
        this.usuari = user;
        this.llistaCompra = new LinkedList<ElementComanda>();
        this.preuTotal = 0;
    }

    public void addLP(int quantitat, String producto) {

        this.llistaCompra.add(new ElementComanda(producto, quantitat);

    }

    // method per afegir element a la llista compra
    // method per retornar el preu total
    // method per retornar la llista compra

}

/*

    public static void main(String[] args) {
        Manager g = ... new ProductManagerImpl();

        g.addProduct("cafe", 2);
        g.addUser("33333", "toni", ..)

        Pedido p = new Pedido("3333");
        p.addLP(3, "donnuts");
        p.addLP(4, "cafe");

        g.addOrder(p);

    }
    */



