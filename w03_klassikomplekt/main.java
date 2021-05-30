public class main{
    public static void main(String[] arg){

    risttahukas r=new risttahukas(3, 4, 5);
    System.out.println("Risttahukas");
    System.out.println("Ruumala: " + r.Ruumala());
    System.out.println("Külje pindala: " + r.KyljePindala());

    silinder s=new silinder(10, 3);
    System.out.println("Silinder");
    System.out.println("Põhja pindala: " + s.KysiPohjaPindala());
    System.out.println("Külje pindala: " + s.KyljePindala());
    }
}