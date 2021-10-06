import java.util.*;

public class ManagerImpl implements Manager {

    private Queue<Comanda> misComandas = new LinkedList<Comanda>();
    private List<Producto> listaProductos = new LinkedList<Producto>();
    private Hashtable<String, Usuari> usuaris = new Hashtable<String, Usuari>();
    private OrdenarProductoPerVentas o;


    public List<Producto> ordenarProductosPrecio(){
        List<Producto> listaOrdenada = this.listaProductos;
        Collections.sort(listaOrdenada);
        return listaOrdenada;
    }

    public void realizarPedido(Comanda comanda) {
        this.misComandas.add(comanda);
    }

    @Override
    public void servirPedido() {
        for(ElementComanda e : misComandas.peek().getLlistaCompra()){
            for(Producto p : listaProductos){
                if (e.getNombreProducto() == p.getNombre()){
                    p.ventaRealizada(e.getQuantitat());
                }
            }
        }

        String usuariID = misComandas.peek().getUsuariID();
        Usuari usuari = this.usuaris.get(usuariID);
        usuari.afegirComanda(misComandas.poll());
    }

    @Override
    public List<Comanda> listadoPedidosUser(String usuariID) {
        return this.usuaris.get(usuariID).getLlistaComandesServides();
    }
    @Override
    public List<Producto> ordenarProductosVentas(){

        List<Producto> listaOrdenada = this.listaProductos;
        Collections.sort(listaOrdenada,new OrdenarProductoPerVentas());
        return listaOrdenada;
    }

    @Override
    public void añadirProductoLista(Producto producto){
        this.listaProductos.add(producto);
    }

    public void añadirUsuario(Usuari usuari){
        usuaris.put(usuari.getUsuariID(), usuari);
    }


}
