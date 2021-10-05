import java.util.List;

public interface Manager {
    //El que ens demana ell
    public List<Producto> ordenarProductosPrecio() throws EmptyList;
    public void realizarPedido(Comanda comanda);
    public Comanda servirPedido();
    public List<Comanda> listadoPedidosUser(String nombre);
    public List<Producto> ordenarProductosVentas() throws EmptyList;

}
