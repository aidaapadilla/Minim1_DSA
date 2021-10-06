public class ElementComanda {

    private String producto;
    private int quantitat;

    public ElementComanda(String producto, int quantitat){

            this.producto = producto;
            this.quantitat = quantitat;

        }
        /*
        public double getPreutotal(){
            return this.preutotal;
        }

         */

    public String getNombreProducto(){
        return this.producto;
    }

    public int getQuantitat(){
        return this.quantitat;
    }

}
