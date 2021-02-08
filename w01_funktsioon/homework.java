import java.util.Calendar;
import java.util.TimeZone;
import java.util.Scanner;

public class homework{
	public static void main(String[] arg){
        
        Scanner input = new Scanner(System.in); 
    
        System.out.print("Sisesta sünniaasta: ");
        double birthyear = input.nextDouble();
        System.out.print("Sisesta sünnikuu: ");
        double birthmonth = input.nextDouble();
        System.out.print("Sisesta sünnipäev: ");
        double birthday = input.nextDouble();
        
        double totaldays = (365.25 * birthyear) +  (30.44 * birthmonth) +  (birthday) ;
        //System.out.println("Päevi: " + birthday); 

        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        int day = calendar.get(Calendar.DATE);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);

        //System.out.println("Current Day is: " + day);
        //System.out.println("Current Month is: " + month);
        //System.out.println("Current Year is: " + year);

        double nowdays = (365.25 * year) +  (30.44 * month) +  (day) ;
        //System.out.println("Päevi: " + nowdays); 

        double age = (nowdays - totaldays ) / 365.25 ; 

        System.out.printf("Sinu vanus on:  %.1f\n", age);
    }
}