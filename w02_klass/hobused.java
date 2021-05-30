import java.util.*;

public class hobused{
    Hashtable<String, Integer> hobused = new Hashtable<String, Integer>();

    public Set kysiNimed(){return hobused.keySet();}

    public void lisa(String nimi, Integer hind){
        if(hobused.containsKey(nimi)){
            System.out.println(nimi+" on juba müügis");
        } else {
            hobused.put(nimi, hind);
        }
    }

    public void eemaldus(String nimi){
        hobused.remove(nimi);
    }

    public void muutus(String nimi, Integer hind){
        hobused.put(nimi, hind);
    }

}