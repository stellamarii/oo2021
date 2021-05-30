import java.util.Scanner;

public class Proov4{
    public static void main(String[] arg){
        Puhver<Integer, Integer> p1=new Puhver<Integer, Integer>(new RuuduArvutaja());
        System.out.println(p1.arvuta(3));
        System.out.println(p1.arvuta(5));
        System.out.println(p1.arvuta(3));
        System.out.println(p1.hoidla);

        Puhver<String, String> p2=new Puhver<String, String>(new Kahekordistaja());
        System.out.println(p2.arvuta("test"));
        System.out.println(p2.hoidla);
        
        Scanner input = new Scanner(System.in);
        System.out.print("Sisesta kordaja: ");
        Integer kordaja = input.nextInt(); 
        Puhver<String, String> p3=new Puhver<String, String>(new Mitmekordistaja(kordaja));
        
        System.out.println(p3.arvuta("test"));
        System.out.println(p3.hoidla);
    }
}