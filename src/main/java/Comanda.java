import java.util.LinkedList;
import java.util.List;

public class Comanda {

    private String usuariID;
    private List<ElementComanda> llistaCompra = new LinkedList<ElementComanda>();
    private int preuTotal;


    public Comanda(String user) { // Constructor
        this.usuariID = user;
        this.llistaCompra = new LinkedList<ElementComanda>();
        this.preuTotal = 0;
    }

    public String getUsuariID(){
        return this.usuariID;
    }

    public List<ElementComanda> getLlistaCompra(){
        return this.llistaCompra;
    }

    public void addLP(int quantitat, String producto) {

        this.llistaCompra.add(new ElementComanda(producto, quantitat));

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



