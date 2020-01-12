import java.util.*;

class ReachOne {

    public static boolean isReachDigitOne(int value) {

        int inc2, n, rem, add = 0, div = 0;
        n=value;
        while (n > 0) {
            rem = n % 10;
            rem *= rem;
            n = n / 10;
            add += rem;
        }
        
        if (add == 1) {
            return true;
        }
        else if (add <= 9) {
            return false;
        }
        else {
            return isReachDigitOne(add);
        }
    }

    public static void main(String[] args) {
        
        int getValue, inc1;
        System.out.println("Enter the value to reach digit '1' : ");
        Scanner sc = new Scanner(System.in);
        getValue = sc.nextInt();
        if (isReachDigitOne(getValue)) {
            System.out.println(getValue + " Reached Digit '1' :)");
        }
        else {
            System.out.println(getValue + " Not Reached The Digit '1' :(");
        }

    }
}