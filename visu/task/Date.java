import java.time.*;
import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int year = sc.nextInt();
            int month = sc.nextInt();
            int date = sc.nextInt();
            LocalDate today = LocalDate.now();
            LocalDate getday = LocalDate.of(year, month, date);
            Period diff = Period.between(getday, today);
            System.out.println("" + diff);
        } catch (Exception e) {
            System.out.println("enter a valid month");
        }
    }
}
