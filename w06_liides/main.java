import java.util.Scanner;

public class main{
	public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Soovid liita(1) või lahutada(2): ");
        Integer soov = input.nextInt();
        if(soov == 1){
            System.out.print("Esimene arv: ");
            Integer nr1 = input.nextInt();
            System.out.print("Teine arv: ");
            Integer nr2 = input.nextInt();

            calculator add = new sum(nr1); // sulgudesse mitmega liita tahad
            System.out.println(add.calculate(nr2));

        }else if(soov == 2){
            System.out.print("Esimene arv: ");
            Integer nr1 = input.nextInt();
            System.out.print("Teine arv: ");
            Integer nr2 = input.nextInt();
            
            calculator sub=new sub(nr1); // sulgudesse mitmega lahutada tahad
		    System.out.println(sub.calculate(nr2));
        }else{
            System.out.println("Pidid sisestama arvu 1 või 2!");
        }
	}
}