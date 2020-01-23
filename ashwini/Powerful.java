import java.util.*;
 public class Powerful { 
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        System.out.println("enter the value of : " +p);
        if (isValid(p)) 
            System.out.print("true"); 
        else
            System.out.print("false"); 
        if (isValid(p)) 
            System.out.print("true"); 
        else
            System.out.print("false"); 
    } 
    static boolean isValid(int n) 
    { 
        while (n % 2 == 0) { 
            int m = 0; 
            while (n % 2 == 0) { 
                n /= 2; 
                m++; 
            } 
            if (m == 1) 
                return false; 
        } 
        int factor = 3; 
        if(factor <= Math.sqrt(n))
        { 
            int m= 0; 
            while (n % factor == 0) { 
                n = n / factor; 
                m++; 
            } 
            factor += 2;
            if (m == 1) 
                return false; 
        } 
        return (n == 1); 
    } 
} 
  