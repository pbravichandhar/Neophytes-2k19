import java.util.*;

public class ReachDigit1 {
    private static void checkNum(int input) {
        int count = 0;
        for (int index = 0; input != 1; index++) {
            input = findSum(input);
            System.out.print(input + "--->");
            if (input == 1) {
                System.out.println(" it Reach the Digit 1");
                System.exit(0);
            } else if (input < 10 && input != 7) {
                System.out.println(" it did not Reach the digit 1");
                System.exit(0);
            }
        }
        System.out.println(" it Reach the Digit 1");

    }

    private static int findSum(int input) {
        int sum = 0;
        while (input != 0) {
            sum = sum + (input % 10) * (input % 10);
            input = input / 10;
            // System.out.print(sum+" "+input);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int input = sc.nextInt();
        checkNum(input);
    }
}
