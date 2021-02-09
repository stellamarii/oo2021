import java.util.*;

public class retsept{
    Hashtable<String, Double> ained = new Hashtable<String, Double>();

    public Set kysiAinenimed(){return ained.keySet();}

    public Hashtable<String, Double> kysiAined(){return ained;}

    public void lisa(String aine, double kogus){
        if(ained.containsKey(aine)){
            System.out.println(aine+" juba olemas, uus kogus lisati vanale");
            double uusKogus = ained.get(aine) + kogus;
            ained.put(aine, uusKogus);
        } else {
            ained.put(aine, kogus);
        }
    }

    public double koguMass(){
        double summa=0;
        for(double kogus: ained.values()){
            summa+= kogus;
        }
        return summa;
    }
    
    public retsept koopia (double koef){
        retsept uus = new retsept();
        for(String aine: ained.keySet()){
            uus.lisa(aine, koef*ained.get(aine));
        }
        return uus;
    }

    public retsept v2ikekoopia (double l6ppKogus, double kogus){
        retsept uus = new retsept();
        double koef = l6ppKogus/kogus;
        for(String aine: ained.keySet()){
            uus.lisa(aine, koef*ained.get(aine));
        }
        return uus;
    }
}