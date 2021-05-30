/* 
* Koosta klass Jook, millel on nimetus, liitri omahind ning erikaal. Koosta klass Joogipudel, millel on maht, pudelityyp, mass ning taara maksumus. Samuti sees olev Jook, mis võib ka puududa. Koosta Joogipudeli jaoks käsklus, mis leiaks Joogipudeli massi koos Joogiga (juhul kui see olemas), samuti käsklus sellise komplekti omahinna leidmiseks. Koosta tööks automaattestid.
* Koosta klass Joogivaat, millel on ruumala ning sees oleva Joogi kogus liitrites. Koosta käsk etteantud Joogipudeli täitmiseks (juhul kui Jooki jagub). Koosta käsklus kogu Joogivaaditäie Joogi villimiseks Joogipudelitesse. Koosta töö kontrolliks automaattestid.
* Koosta Joogipudelite Kasti jaoks klass. Väljadeks kastityyp, kastihind, kastimass ning pesade arv (mitu pudelit mahub). Loo käsklused kasti ja sinna kuuluvate pudelite ühise massi ja omahinna arvutamiseks. Loo käsklus Joogivaadist Kasti sisse pudelite villimiseks. Koosta automaattestid. 

jook - nimetus, hindL, erikaal
pudel -maht, tyyp, hindT, mass
vaat - ruumala, joogiKogus
kast - tyyp, hindK, mass, pesad
 */
public class proov1{
    public static void main(String[] arg){
        jook j1 = new jook("kali", 4, 1);
        jook j2 = new jook("coca", 5, 1);
        jook j3 = new jook("džinn", 20, 0.94);
        jook j4 = new jook("siirup", 2, 1.18);
        
        pudel p1 = new pudel("plast", 0.10, 0.020, 1.5);
        pudel p2 = new pudel("klaas", 0.10, 0.300, 0.5);
        pudel p3 = new pudel("tops", 0, 0.010, 0.2);

        System.out.println(j1.jook());
        System.out.println("Kali plast");
        System.out.println(p1.hind(j1));
        System.out.println(p1.mass(j1));
        System.out.println("coca klaas");
        System.out.println(p2.hind(j2));
        System.out.println(p2.mass(j2));
        System.out.println("Dzinn klaas");
        System.out.println(p2.mass(j3));
        System.out.println("Siirup tops");
        System.out.println(p3.mass(j4));

        System.out.println("villimine");
        vaat v1 = new vaat(200, 200);
        System.out.println("200 l vaat, 0,5 l pudel: " + v1.villi(p2));
        System.out.println("200 l vaat, 0,2 l tops: " + v1.villi(p3));
        vaat v2 = new vaat(200, 102);
        System.out.println("102 l vaat, 0,5 l pudel: " + v2.villi(p2));
        System.out.println("102 l vaat, 1,5 l pudel: " + v2.villi(p1));
        System.out.println("102 l vaat, üks 0,5 l pudel: " + v2.villiPudel(p1));

        System.out.println("kastid");
        kast k1 = new kast("24-pudelit", 30, 8, 24);
        System.out.println("Kali balloonis, 24 kast hind: " + k1.kastihind(p1,j1));
        System.out.println("Kali balloonis, 24 kast mass: " + k1.kastimass(p1,j1));

    }
}