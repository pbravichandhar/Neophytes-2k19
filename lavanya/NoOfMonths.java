import java.time.*;
import java.util.*;

class NoOfMonths {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int year = inp.nextInt();
        int month = inp.nextInt();
        int date = inp.nextInt();
        LocalDate today = LocalDate.now();
        LocalDate getday = LocalDate.of(year, month, date);
        Period p = Period.between(getday, today);
        int years = p.getYears();
        int months = p.getMonths();
        int monthsinbetween = years * 12 + months;
        System.out.println(monthsinbetween);
    }
}
