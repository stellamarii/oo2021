/* Ioonid ja ained

* Loo liides iooni andmete tarbeks - nimetus, aatommasside summa, laeng. Loo realiseeriv klass, kus nimetus on stringina. Koosta paar näidet - H+, NO3-. Koosta automaattest iooni loomise ning andmete küsimise kohta.
* Loo liides aine jaoks. Aine kohta saab küsida nimetuse ja molekulmassi. Koosta realiseeriv klass kahe iooni kokkupanekul tekkiva aine jaoks. Konstruktoris kontrollitakse, et ioonide laengud oleksid võrdsed ja vastasmärgilised. Nimetuses kuvatakse positiivse iooni nimetus eespool. Koosta automaattestid ainete loomise ja molekulmassi arvutamise kohta. Lubatud on näiteks NaCl ja CaO, aga mitte CaCl (sest kaltsium on 2+ ning kloor 1-)
* Loo aine liidest realiseeriv uus klass, kuhu eraldi antakse sisse ioonide massiiv. Aine luuakse vaid juhul, kui laengute summa on 0. Nimetuses kuvatakse iooni kordumine vastava numbriga. Nt [Ca2+, Cl-, Cl-] loetakse sobivaks ning kuvatakse CaCl2. Koosta rakendus, kus failis olevasse loetellu saab lisada ioone. Kui loetelus olevatest ioonidest saab moodustada aine, siis kuvatakse see vastava klassi abiga ning näidatakse ka aine molekulmass. */

import java.io.*;
public class main{
    public static void main(String[] arg) throws IOException{
        ioon H = new ioon("Vesinik", 1, +1);
        ioon K = new ioon("Kaalium", 39, +1);
        ioon Na = new ioon("Naatrium", 23, +1);
        ioon Al = new ioon("Alumiinium", 27, +3);
        ioon O = new ioon("oksiid", 16, -2);
        ioon F = new ioon("fluoriid", 19, -1);
        ioon OH = new ioon("hüdroksiid", 17, -1);
        ioon NO3 = new ioon("nitraat", 62, -1);
        System.out.println(H.aineNimetus(F));
        System.out.println(Al.aineNimetus(OH));
        System.out.println(Na.aineNimetus(O));
        System.out.println(K.aineNimetus(OH));
        System.out.println(NO3.aineNimetus(K));

        System.out.println(Na.mmass(O));
        System.out.println(K.mmass(OH));
        System.out.println(NO3.mmass(K));


        /* BufferedReader sisse=new BufferedReader(
            new FileReader("ioonid.txt")
        );
        String rida=sisse.readLine();
        while(rida!=null){
            System.out.println(rida);
            rida=sisse.readLine();
        }
        sisse.close();

        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } */
    }
}