public abstract class Producto {

    public abstract void ventaRealizada(int numero);

    public abstract double getPrecio() ;

}
abstract class Cafe extends Producto{
    double precio=1;
    double ventas;

    @Override
    public double getPrecio() {
        return this.precio;
    }

    @Override
    public void ventaRealizada(int numero) {
        this.ventas=this.ventas+numero;
    }
}
abstract class Redvelvet extends Producto{
    double precio=3.5; //Tall de redvelvet
    double ventas;
    @Override
    public double getPrecio() {
        return this.precio;
    }

    @Override
    public void ventaRealizada(int numero) {
        this.ventas=this.ventas+numero;
    }
}
abstract class Cheesecake extends Producto
{
    double precio=3.5;
    double ventas;
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
    double precio=5;
    double ventas;

    @java.lang.Override
    public void ventaRealizada(int numero) {
        this.ventas=this.ventas+numero;
    }

    @java.lang.Override
    public double getPrecio() {
        return precio;
    }
}

