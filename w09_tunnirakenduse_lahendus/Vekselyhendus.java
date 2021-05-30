public class Vekselyhendus extends Hulgiyhendus{
    public boolean kasJuhib(){
        for(Voolujuht v: hoidla){
            if(v.kasJuhib()){return true;}
        }
        return false;
    }
}