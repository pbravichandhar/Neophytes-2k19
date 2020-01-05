import java.time.*;
import java.util.Scanner;

public class Date1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year1 = sc.nextInt();
        int month1 = sc.nextInt();
        int date1 = sc.nextInt();
        int year2 = sc.nextInt();
        int month2 = sc.nextInt();
        int date2 = sc.nextInt();
        LocalDate getday = LocalDate.of(year1, month1, date1);
        LocalDate getday1 = LocalDate.of(year2, month2, date2);
        Period diff = Period.between(getday, getday1);
        System.out.println("" + diff);
    }
}