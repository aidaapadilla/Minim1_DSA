import java.util.List;

public interface Manager {
    //Aqui falta posar lo que ens ha explicat ell
    public double getPrecio();
    public void ventaRealizada(int num);

    //El que ens demana ell
    public List<Producto> ordenarProductosPrecio() throws EmptyList;
    public void realizarPedido(Comanda comanda);
    public void servirPedido();
    public List<Comanda> listadoPedidosUser(string nombre);
    public List<Producto> ordenarProductosVentas() throws EmptyList;

}
