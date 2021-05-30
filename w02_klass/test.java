import java.util.Scanner;

public class test{
    public static void main(String[] arg){
        hobused myygiks=new hobused();
        myygiks.lisa("Angela", 400);
        myygiks.lisa("Ronaldo", 800);

        System.out.println(myygiks.hobused);

        Integer i=0;
        while(i<1){

            Scanner input = new Scanner(System.in);

            System.out.print("Soovid hobust osta(1), müüa(2), hinda muuta(3), lõpetada tehingute tegemise(4): ");
            Integer soov = input.nextInt();

            if(soov == 1){
                System.out.print("Kelle soovid osta? ");
                String ost = input.next();

                myygiks.eemaldus(ost); //eemaldab tabelist

                System.out.println("Need hobused on müügis:");
                System.out.println(myygiks.hobused);

            } else if(soov == 2){
                System.out.print("Sisesta müüki pandava hobuse nimi: ");
                String uusNimi = input.next();
                System.out.print("Sisesta tema hind: ");
                Integer uusHind = input.nextInt();
                
                myygiks.lisa(uusNimi, uusHind); //sisestab uue kande

                System.out.println("Need hobused on müügis:");
                System.out.println(myygiks.hobused);

            } else if(soov == 3){
                System.out.print("Kelle hinda soovid muuta? ");
                String nimi = input.next();
                System.out.print("Sisesta tema uus hind: ");
                Integer uusHind = input.nextInt();

                myygiks.muutus(nimi, uusHind); //muudab hinna ära 

                System.out.println("Need hobused on müügis:");
                System.out.println(myygiks.hobused);

            } else if(soov == 4){
                System.out.println("Aitäh ostlemast!");
                i = 1;

            }
            else{
                System.out.println("Pidid sisestama arvu 1, 2 või 3!");
            }

        }
    }
}