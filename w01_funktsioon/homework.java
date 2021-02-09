import java.util.Calendar;
import java.util.TimeZone;
import java.util.Scanner;

public class homework{

    public static double age(double birthyear, double birthmonth, double birthday){
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        int day = calendar.get(Calendar.DATE);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);

        double totaldays = (365.25 * birthyear) +  (30.44 * birthmonth) +  (birthday);

        double nowdays = (365.25 * year) +  (30.44 * month) +  (day);

        double age = round(nowdays - totaldays) / 365.25;

        return age;
    }

	public static void main(String[] arg){
        
        Scanner input = new Scanner(System.in); 
    
        System.out.print("Sisesta sünniaasta: ");
        double birthyear = input.nextDouble();
        System.out.print("Sisesta sünnikuu: ");
        double birthmonth = input.nextDouble();
        System.out.print("Sisesta sünnipäev: ");
        double birthday = input.nextDouble();      

        System.out.println("Sinu vanus on: " +age(birthyear, birthmonth, birthday));
        
    }
}
