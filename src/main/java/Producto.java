public abstract class Producto{

    public abstract void ventaRealizada(int numero);

    public abstract double getPrecio();

    /*
    private double precio;
    private double ventas;
    private String nombre;

    public Producto(String nombre, double precio) {

        this.nombre = nombre;
        this.precio = precio;
        this.ventas = 0;
    }
    */

}

abstract class Cafe extends Producto{
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
abstract class RedVelvet extends Producto{
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
abstract class CheeseCake extends Producto
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
abstract class Vurger extends Producto
{
    //oh fuck that's vegan
    private double precio=5;
    private double ventas;

    public Vurger()
    {
        this.ventas=0;
    }

    @java.lang.Override
    public void ventaRealizada(int numero) {
        this.ventas=this.ventas+numero;
    }

    @java.lang.Override
    public double getPrecio() {
        return precio;
    }
}

