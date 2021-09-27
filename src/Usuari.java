import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Usuari {
    List<Comanda> llistacomandes = new ArrayList<Comanda>(10);
    String nomusuari;
    double numcomandes=0;

    public Usuari (String nom){
        this.nomusuari=nom;
    }

    public void RealitzarComanda(Comanda comanda) {
        llistacomandes.add(comanda);
    }

    public void Afegirnumcomandes (double comandes) {
        this.numcomandes=comandes;
    }

}

