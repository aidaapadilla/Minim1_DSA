import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Usuari {
    List<Comanda> llistaComandesServides = new LinkedList<Comanda>();
    String usuariID;
    double numcomandes;

    public Usuari (String usuariID){
        this.usuariID=usuariID;
        this.numcomandes=0;
    }

    public String getUsuariID(){
        return this.usuariID;
    }

    public void afegirComanda(Comanda comanda){
        this.llistaComandesServides.add(comanda);
    }

    public List<Comanda> getLlistaComandesServides(){
        return this.llistaComandesServides;
    }

}

