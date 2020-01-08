import java.util.*;
public class Digit
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element: ");
        int n = sc.nextInt();
        int r=n;
        while (r != 1) 
        {
            r= calculate(r);
            if (r < 10 && r <=4 ) 
            {
                System.out.println(n+ " is not a happy number");
            } else if (r == 1) 
            {
                System.out.println(n+ " is a happy number");
                System.exit(0);
            }
        }
    }

    public static int calculate(int n)
     {
        int sum=0;
        while (n!= 0)
         {
            int rem = n % 10;
            sum = sum + rem * rem;
            n = n / 10;
        }
        return sum;
    }
}