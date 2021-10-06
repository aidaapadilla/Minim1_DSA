public class Cafe extends Producto{
    private double precio=1;
    private double ventas;
    public Cafe()
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
