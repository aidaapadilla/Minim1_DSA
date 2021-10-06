import java.util.List;

public interface Manager {
    //El que ens demana ell
    public List<Producto> ordenarProductosPrecio() throws EmptyList;
    public void realizarPedido(Comanda comanda, Usuari usuari);
    public void servirPedido();
    public List<Comanda> listadoPedidosUser(String nombre);
    public List<Producto> ordenarProductosVentas() throws EmptyList;
    public void añadirProductoLista(Producto producto);
    public void añadirUsuario(Usuari usuari);

}
