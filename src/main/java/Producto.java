public abstract class Producto{

    public abstract void ventaRealizada(int numero);

    public abstract double getPrecio();
    public int compareTo(Producto o) {
        return (int)(this.getPrecio() - o.getPrecio());
    }

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

