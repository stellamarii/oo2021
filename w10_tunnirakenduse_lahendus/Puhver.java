import java.util.*;
public class Puhver<S, V> implements FunktsiooniLiides<S, V>{
    FunktsiooniLiides<S, V> arvutaja;
    Map<S, V> hoidla=new HashMap<S, V>();
    public Puhver(FunktsiooniLiides<S, V> fliides){
        arvutaja=fliides;
    }
    public V arvuta(S sisend){
        if(!hoidla.containsKey(sisend)){
            hoidla.put(sisend, arvutaja.arvuta(sisend));
        }
        return hoidla.get(sisend);
    }
}