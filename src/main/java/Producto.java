public abstract class Producto implements Comparable<Producto> {

    public abstract void ventaRealizada(int numero);

    public abstract double getPrecio();

    public int compareTo(Producto o) {
        return (int) (this.getPrecio() - o.getPrecio());
    }
}

    /*

    private double precio;
    private double ventas;

    public Producto(String nombre, double precio) {
        this.precio = precio;
        this.nombre = nombre;
        this.ventas = 0;
    }

    public String getNombre(){
        return this.nombre;
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
*/
