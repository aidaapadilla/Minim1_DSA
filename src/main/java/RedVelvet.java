public class RedVelvet extends Producto{
    private double precio=3.5; //Tall de redvelvet
    private double ventas;
    public RedVelvet(){
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
