public class Proov5{
    public static void kuvaOlek(Voolujuht v){
        if(v.kasJuhib()){
            System.out.println("Juhib");
        } else {
            System.out.println("Ei juhi");
        }
    }
    public static void main(String[] arg){
        Lyliti l1=new Lyliti();
        Lyliti l2=new Lyliti();
        Lyliti l3=new Lyliti();
        Lyliti l4=new Lyliti();
        Lyliti l5=new Lyliti();
        l1.seisund(false);
        l2.seisund(false);
        l3.seisund(true);
        l4.seisund(false);
        l5.seisund(true);

        Roopyhendus r1=new Roopyhendus();
        r1.lisa(l1);
        r1.lisa(l2);

        Jadayhendus j1=new Jadayhendus();
        j1.lisa(r1);
        j1.lisa(l3);

        Roopyhendus r2=new Roopyhendus();
        r2.lisa(j1);
        r2.lisa(l4);

        Jadayhendus j2=new Jadayhendus();
        j2.lisa(r2);
        j2.lisa(l5);


        kuvaOlek(j2);
    }
}