import java.util.*;

public class ManagerImpl implements Manager {

    private Queue<Comanda> misComandas = new LinkedList<Comanda>();
    private List<Producto> listaProductos = new LinkedList<Producto>();
    private Hashtable<String, Usuari> usuaris = new Hashtable<String, Usuari>();


    public List<Producto> ordenarProductosPrecio() throws EmptyList {
        //Collections.sort(this.listaProductos);
        return this.listaProductos;
    }

    public void realizarPedido(Comanda comanda, Usuari a) {
        getComanda().add(comanda);
        a.llistaComandes.add(comanda);
        a.numcomandes++;
    }
    public Queue<Comanda> getComanda(){
        return this.misComandas;
    }

    @Override
    public void servirPedido() {
        String usuariID = misComandas.peek().getUsuariID();
        Usuari usuari = this.usuaris.get(usuariID);
        usuari.afegirComanda(misComandas.poll());
    }

    @Override
    public List<Comanda> listadoPedidosUser(String usuariID) {
        return this.usuaris.get(usuariID).getLlistaComandesServides();
    }
    @Override
    public List<Producto> ordenarProductosVentas() throws EmptyList {
        return null;
    }
    @Override
    public void añadirProductoLista(Producto producto){
        this.listaProductos.add(producto);
    }

    public void añadirUsuario(Usuari usuari){
        usuaris.put(usuari.getUsuariID(), usuari);
    }

}
