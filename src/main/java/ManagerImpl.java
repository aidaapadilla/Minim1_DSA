import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ManagerImpl implements Manager{
    Queue<Comanda> misComandas = new LinkedList<Comanda>(); //Aqui hi haurà la cua de comandes per realitzar-les
    List<Comanda> comandasRealizadas = new LinkedList<Comanda>(); //Aqui guardem les comandes
    List<Producto> listaProductos;
    Cafe cafe;
    RedVelvet redVelvet;
    CheeseCake cheeseCake;
    Vurger vurger;

    @Override
    public List<Producto> ordenarProductosPrecio() throws EmptyList {
        int i=1;
        while(i<=4)
        {

        }
        return null;
    }

    @Override
    public void realizarPedido(Comanda comanda) {

    }

    @Override
    public Comanda servirPedido() {
        this.comandasRealizadas.add(misComandas.peek());
        return misComandas.peek(); //Comanda servida y guardada
    }

    @Override
    public List<Comanda> listadoPedidosUser(String nombre) {
        //Aqui falta guardar la llista de comandes
        return null;
    }

    @Override
    public List<Producto> ordenarProductosVentas() throws EmptyList {
        return null;
    }
}
