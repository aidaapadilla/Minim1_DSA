public abstract class Producto{
    public abstract void ventaRealizada(int numero);
    public abstract double getPrecio();

}
class Cafe extends Producto{

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
class RedVelvet extends Producto{
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
class CheeseCake extends Producto
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
class Vurger extends Producto
{
  //oh fuck that's vegan
    private double precio=5;
    private double ventas;

    public Vurger()
    {
        this.ventas=0;
    }

    @Override
    public void ventaRealizada(int numero) {
        this.ventas=this.ventas+numero;
    }
    @Override
    public double getPrecio() {
        return precio;
    }
}