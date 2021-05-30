/* · Kui sisestatud arvudest on lugeja suurem kui nimetaja, esita arv segaarvuna.
(nt, 7/4 -> 1 3/4).
· Liida kokku kaks murdu, esita tulemus segaarvuna.
· Lisaks eelmisele taanda vastus. */

import java.util.Scanner;
//import java.lang.Math;

public class main{

    public static void toimeta(Integer lugeja, Integer nimetaja){
        if(lugeja > nimetaja && nimetaja != 0){
            Integer taisarv = lugeja/nimetaja;
            //System.out.println(taisarv);
            //Integer taisarv = algneTaisarv-(algneTaisarv%1);
            Integer jaak = lugeja % nimetaja;
            if(jaak == 0){
                System.out.println(lugeja+"/"+nimetaja+" = "+taisarv);
            }else{
                System.out.println(lugeja+"/"+nimetaja+" = "+taisarv +" "+ jaak +"/"+ nimetaja);
            }
        }else{
            if(nimetaja == 0){
                System.out.println("Nimetaja ei saa olla 0!");
            }else if(lugeja == 0){
                System.out.println(lugeja+"/"+nimetaja+" = 0");
            }else{
                System.out.println(lugeja +"/" + nimetaja);
            }
        }
        System.out.println();
    }

    /* public static void liida(Integer lugeja, Integer nimetaja, Integer lugeja2, Integer nimetaja2){
        Integer uusLugeja = lugeja*nimetaja2 + lugeja2*nimetaja;
        Integer uusNimetaja = nimetaja*nimetaja2;
        System.out.println("Liidetud: " + uusLugeja +"/"+uusNimetaja);
    } */

    public static void taanda(Integer lugeja, Integer nimetaja){
        Integer syt = 0;
        for(int i = 1; i <= lugeja && i <= nimetaja; i++)
        {
            if(lugeja%i==0 && nimetaja%i==0)
                syt = i;
        }

        if(syt == 1){
            System.out.println("Suurim ühiskordne on 1, ei saa taandada!");
        }else{
            System.out.println("Taandatud!");
            Integer taandatudLugeja = lugeja / syt;
            Integer taandatudNimetaja = nimetaja / syt;
            toimeta(taandatudLugeja, taandatudNimetaja);
        }
        
    }

    public static void main(String[] arg){
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Sisesta lugeja: ");
        Integer lugeja = input.nextInt();
        System.out.print("Sisesta nimetaja: ");
        Integer nimetaja = input.nextInt();
        toimeta(lugeja, nimetaja);
    
        System.out.print("Sisesta teine lugeja: ");
        Integer lugeja2 = input.nextInt();
        System.out.print("Sisesta teine nimetaja: ");
        Integer nimetaja2 = input.nextInt();
        toimeta(lugeja2, nimetaja2);

        Integer uusLugeja = lugeja*nimetaja2 + lugeja2*nimetaja;
        Integer uusNimetaja = nimetaja*nimetaja2;
        System.out.println("Liidetud!");

        toimeta(uusLugeja, uusNimetaja);
        taanda(uusLugeja, uusNimetaja);
        
    }
}