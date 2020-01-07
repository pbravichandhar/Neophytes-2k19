//Program to calculate the number of months between two dates
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;
public class MonthsBWDate{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first date in the order of day,month and year");
      try{
        int day1=scan.nextInt();
        int month1=scan.nextInt();
        int year1=scan.nextInt();
        System.out.println("Enter the second date in the order of day,month and year");
        int day2=scan.nextInt();
        int month2=scan.nextInt();
        int year2=scan.nextInt();
        LocalDate firstday = LocalDate.of(year1,month1,day1);
        LocalDate lastday = LocalDate.of(year2,month2,day2);
        Period p = Period.between(firstday,lastday);
        int months = p.getMonths();
        months+=((year2-year1)*12);
        System.out.println("number of months: " + months);
    }
    catch(Exception e){
        System.out.println(e);
    }
    }

}
