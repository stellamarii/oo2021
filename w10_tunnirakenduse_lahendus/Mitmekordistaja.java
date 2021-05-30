public class Mitmekordistaja implements FunktsiooniLiides<String, String>{
    Integer k;
    public Mitmekordistaja(Integer k){this.k=k;}
    public String arvuta(String sisend){
        Integer i = 1;
        String väljund = sisend;
        while(i<k){
            väljund += " " + sisend;
            i++;
        } 
        return väljund;
    }
}