public class kast{
    String tyyp;
    Double hindK, mass, pesad;
    public kast(String tyyp, double hindK, double mass, double pesad){
        this.tyyp=tyyp; this.hindK=hindK; this.mass=mass; this.pesad=pesad;
    }
    public double kastihind(pudel p, jook j){
        return (double) Math.round((hindK+pesad*(p.hind(j))) * 100) / 100;
    }
    public double kastimass(pudel p, jook j){
        return (double) Math.round((p.mass(j)*pesad+mass)*100)/100;
    }
}