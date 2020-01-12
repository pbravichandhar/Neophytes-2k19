import java.util.*;
public class ReachTheDigit1 {
    public static int CalculateSum(int num) {
        int sum = 0;
        int rem=0;
        while (num >0) {
            rem = num % 10;
            sum = sum + rem * rem;
            num = num / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        int result = num;
        while (result != 1 && result != 4) {
            result = CalculateSum(result);
        }
        if (result == 1){
            System.out.println("successfully converted to binary digit 1");
        }
        else if (result == 4){
            System.out.println("conversion failed");
        }
    }

    
}