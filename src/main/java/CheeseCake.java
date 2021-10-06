public class CheeseCake extends Producto
{
    private double precio=3.5;
    private double ventas;
    public CheeseCake()
    {
        this.ventas=0;
    }
    @Override
    public double getPrecio() {
        return this.precio;
    }

    @Override
    public void ventaRealizada(int numero) {
        this.ventas=this.ventas+numero;
    }
}
