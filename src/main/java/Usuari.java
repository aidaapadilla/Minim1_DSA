import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Usuari {
    List<Comanda> llistacomandes = new LinkedList<Comanda>();//<<<new ArrayList<Comanda>(10); //Llista de comandes del usuari
    String nomusuari;
    double numcomandes;

    public Usuari (String nom){
        this.nomusuari=nom;
        this.numcomandes=0;
    }


}

