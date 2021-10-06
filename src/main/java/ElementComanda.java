public class ElementComanda {

    private Producto producte;
    private int quantitat;
    private double preutotal=0;

    public ElementComanda(Producto producto, int quantitat){

            this.producte = producto;
            this.quantitat = quantitat;
            this.preutotal=quantitat*producto.getPrecio();
        }
        public double getPreutotal(){
            return this.preutotal;
        }

    //public String getNombreProducto(){
        //return this.producto;
    //}

    public int getQuantitat(){
        return this.quantitat;
    }

}
