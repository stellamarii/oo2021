public class Proov1{
    public static void kuvaOlek(Voolujuht v){
        if(v.kasJuhib()){
            System.out.println("Juhib");
        } else {
            System.out.println("Ei juhi");
        }
    }
    public static void main(String[] arg){
        Lyliti l1=new Lyliti();
        l1.seisund(false);
        kuvaOlek(l1);
    }
}