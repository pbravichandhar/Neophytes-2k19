import java.util.*;
import java.time.LocalDate;
import java.time.period;
import java.time.month;

class MonthsBetDates{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        try{
            System.out.println("---enter first date---");
            int day1=obj.nextInt();
            int month1=obj.nextInt();
            int year1=obj.nextInt();
            System.out.println("---enter second date---");
            int day2=obj.nextInt();
            int month2=obj.nextInt();
            int year2=obj.nextInt();
            LocalDate first=LocalDate.of(day1,month1,year1);
            LocalDate second=LocalDate.of(day2,month2,year2);
            Period p=Period.Between(first,second);
            int monthbetween=p.getMonth();
            System.out.println("number of months in between:"+monthbetween);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}