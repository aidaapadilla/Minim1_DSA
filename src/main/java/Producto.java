public class Producto implements Comparable<Producto>{


    private double precio;
    private double ventas;

    public Producto(double precio) {
        this.precio = precio;
        this.ventas = 0;
    }

    public void ventaRealizada(int numero){
        this.ventas = this.ventas + numero;
    }

    public double getPrecio(){
        return this.precio;
    }

    public int compareTo(Producto a)
    {
        int res = (int) (this.getPrecio()-a.getPrecio());
        return res;
    }

}
