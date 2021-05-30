public class ioon{
    String nimetus; Integer amass, laeng;
    public ioon(String nimetus, Integer amass, Integer laeng){
        this.nimetus=nimetus; this.amass=amass; this.laeng=laeng;
    }
    public String nimetus(){
        return nimetus;
    }
    public Integer laeng(){
        return laeng;
    }
    public String aineNimetus(ioon i){
        if(laeng+i.laeng==0){
            if(laeng>0){
                return nimetus+" "+i.nimetus;
            }else{
                return i.nimetus+" "+nimetus;
            }
        }else{
            return "Selline aine pole võimalik";
        }
    }
    public Integer mmass(ioon i){
        if(laeng+i.laeng==0){
            return amass+amass;
        }else{
            return 0;
        }
    }
}