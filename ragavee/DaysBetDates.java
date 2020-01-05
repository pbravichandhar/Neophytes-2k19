import java.util.*;

class DaysBetDates{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        try{
            int year1=obj.nextInt();
            int year2=obj.nextInt();
            int month1=obj.nextInt();
            int month2=obj.nextInt();
            System.out.println((year2-year1)*12+(month2-month1));
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}