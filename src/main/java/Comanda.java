import javax.swing.text.Element;
import java.util.LinkedList;
import java.util.List;

public class Comanda {

    private String usuari;
    private String usuariID;
    private List<ElementComanda> llistaCompra = new LinkedList<ElementComanda>();
    private double preuTotal;


    public Comanda(Usuari user) { // Constructor
        this.usuari = user.getNomUsuari();
        this.usuariID = user.getUsuariID();
        this.preuTotal = 0;
    }

    public String getUsuariID() {
        return this.usuariID;
    }

    public List<ElementComanda> getLlistaCompra(){
        return this.llistaCompra;
    }

    public void addLP(int quantitat, Producto producto) {
        producto.ventaRealizada(quantitat);
        ElementComanda comanda = new ElementComanda(producto,quantitat);
        this.llistaCompra.add(comanda);
        preuTotal=this.preuTotal+comanda.getPreutotal();
    }

}
