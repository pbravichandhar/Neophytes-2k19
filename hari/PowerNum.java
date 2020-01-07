import java.util.Scanner;

class PowerNum{
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int num = s.nextInt();
        int num2=0;
        if(num == 1)
        {
            System.out.println("The number is a powerful number");
        }
        for(int i = 2; i < num; i++)
        {
            int count=0;
            if( num % i == 0)
            {
                if(isPrime(i))
                {
                    num2 = i * i;
                    if(num % num2 == 0)
                    {
                         System.out.println(i);
                    }
                }
            }
        }
        if(isPrime(num))
        {
            System.out.println(num);
        }
    }
    public static boolean isPrime(int n) {  
        if (n <= 1) {  
            return false;  
        }  
        for (int i = 2; i < Math.sqrt(n); i++) {  
            if (n % i == 0) {  
                return false;  
            }  
        }  
        return true;  
    }
}