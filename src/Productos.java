public abstract class Productos {

    public abstract void venta_realizada(int numero);

    public abstract double get_precio() ;


}
abstract class Cafe extends Productos{
    double precio=1;
    double ventas;

    @Override
    public double get_precio() {
        return this.precio;
    }

    @Override
    public void venta_realizada(int numero) {
        this.ventas=this.ventas+numero;
    }
}
abstract class Redvelvet extends Productos{
    double precio=3.5; //Tall de redvelvet
    double ventas;
    @Override
    public double get_precio() {
        return this.precio;
    }

    @Override
    public void venta_realizada(int numero) {
        this.ventas=this.ventas+numero;
    }
}
abstract class Cheesecake extends Productos
{
    double precio=3.5;
    double ventas;
    @Override
    public double get_precio() {
        return this.precio;
    }

    @Override
    public void venta_realizada(int numero) {
        this.ventas=this.ventas+numero;
    }
}
abstract class Vurger extends Productos
{
    //oh fuck that's vegan

}

