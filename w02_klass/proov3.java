public class proov3{
    public static void main(String[] arg){
        retsept pannkoogid=new retsept();
        pannkoogid.lisa("piim", 500.0);
        pannkoogid.lisa("jahu", 250.0);
        pannkoogid.lisa("muna", 60.0);
        pannkoogid.lisa("suhkur", 100.0);
        pannkoogid.lisa("suhkur", 100.0);
        System.out.println(pannkoogid.kysiAinenimed());
        System.out.println(pannkoogid.koguMass());
        System.out.println(pannkoogid.kysiAined());

        retsept paljuPannkooke=pannkoogid.koopia(3);
        System.out.println(paljuPannkooke.kysiAined());

        retsept v2hePannkooke=pannkoogid.v2ikekoopia(600, pannkoogid.koguMass());
        System.out.println(v2hePannkooke.kysiAined());
    }
}