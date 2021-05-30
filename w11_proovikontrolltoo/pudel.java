public class pudel{
    String tyyp;
    Double hindT, mass, maht;
    public pudel(String tyyp, double hindT, double mass, double maht){
        this.tyyp=tyyp; this.hindT=hindT; this.mass=mass; this.maht=maht;
    }
    public double hind(jook j){
        return maht*j.hindL+hindT;
    }
    public double mass(jook j){
        return j.erikaal*maht+mass;
    }
}