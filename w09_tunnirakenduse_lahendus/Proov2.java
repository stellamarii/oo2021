public class Proov2{
    public static void kuvaOlek(Voolujuht v){
        if(v.kasJuhib()){
			System.out.println("Juhib");
		}else {
			System.out.println("Ei juhi");
		
		}
	}	
	public static void main(String[] arg){
        Lyliti l1=new Lyliti();
        l1.seisund(true);
		Lyliti l2=new Lyliti();
        l2.seisund(false);
		Roopyhendus r1=new Roopyhendus();
        r1.lisa(l1);
        r1.lisa(l2);
		Lyliti l3=new Lyliti();
		l3.seisund(true);
		Jadayhendus j1=new Jadayhendus();
		j1.lisa(r1);
		j1.lisa(l3);
		
        kuvaOlek(j1);
    }
}