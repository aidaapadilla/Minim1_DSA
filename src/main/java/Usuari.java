import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Usuari {
    List<Comanda> llistacomandes = new LinkedList<Comanda>();//<<<new ArrayList<Comanda>(10); //Llista de comandes del usuari
    String nomusuari;
    List<Comanda> llistaComandesServides = new LinkedList<Comanda>();
    String usuariID;
    double numcomandes;

    public String getNomUsuari(){
        return this.nomusuari;
    }
    public void setUsuari(String nom) {
        this.nomusuari = nom;
    }

    public Usuari (String nomusuari, String usuariID){
        this.nomusuari=nomusuari;
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

