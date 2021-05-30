public class vaat{
    Double ruumala, joogiKogus;
    public vaat(double ruumala, double joogiKogus){
        this.ruumala=ruumala; this.joogiKogus=joogiKogus;
    }
    public double villi(pudel p){
        return Math.floor(joogiKogus/p.maht);
    }
    public double villiPudel(pudel p){
        return joogiKogus-=p.maht;
    }
}