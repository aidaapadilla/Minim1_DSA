public class Vurger extends Producto {
    //oh fuck that's vegan
    private double precio = 5;
    private double ventas;

    public Vurger() {
        this.ventas = 0;
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