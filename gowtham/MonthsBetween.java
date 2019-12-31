import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

//  Java Program to calculate number of years and months
class MonthsBetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year1 = sc.nextInt();
        int month1 = sc.nextInt();
        int date1 = sc.nextInt();
        int year2 = sc.nextInt();
        int month2 = sc.nextInt();
        int date2 = sc.nextInt();
        LocalDate input1 = LocalDate.of(year1, month1, date1);
        LocalDate input2 = LocalDate.of(year2, month2, date2);
        Period age = Period.between(input1, input2);
        int years = age.getYears();
        int months = age.getMonths();
        System.out.println("number of months: " + ((years * 12) + months));
    }

}
