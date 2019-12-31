import java.time.*;
public class Mbd
{
    public static void main(String[] args)
    {
        LocalDate today=LocalDate.now();
        LocalDate userday=LocalDate.of(2019, 5 ,15);
        Period diff=Period.between(userday,today);
        System.out.println("\nDifference between "+ userday +" and "+ today +" : " + diff.getYears() +" Years and "  + diff.getMonths() +"Months()s\n");
    }

}