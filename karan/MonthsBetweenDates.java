import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

class monthbtweendatesss {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter the first date in the order of day,month and year");
            int day1=sc.nextInt();
            int month1=sc.nextInt();
            int year1=sc.nextInt();
            System.out.println("Enter the second date in the order of day,month and year");
            int day2=sc.nextInt();
            int month2=sc.nextInt();
            int year2=sc.nextInt();
            LocalDate firstday = LocalDate.of(year1,month1,day1);
            LocalDate lastday = LocalDate.of(year2,month2,day2);
            Period p = Period.between(firstday,lastday);
            int months = p.getMonths();
            months+=((year2-year1)*12);
            System.out.println("number of months: " + months);
        }
        catch(Exception e) {
            System.out.print(e);
        }
    }
}