import java.util.Scanner;

class PowerfulNumber{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        try
        {
            System.out.println("enter number: ");
            int x = obj.nextInt();
            System.out.println(isPowerful(x));
        }
        catch(Exception e){
            System.out.println("invalid input: Not a number");
        }
    }
    static Boolean isPowerful(int num)
    {
        int count1 = 0, count2  = 0;
        int number = num;
        if(num > 0)
        {
            for(int i = 2; i < num; i++)
            {
                while(num % i == 0)
                {
                    num = num / i;
                    count1++;
                    if(number % (i*i) ==0)
                        count2++;
                }
            }
            if(count1 == 0 && count2 == 0){
                System.out.println("it is itself a prime number and not a powerful number");
            }
            else if(count1 == count2)
                return true;
            else 
                return false;
        } 
        return null;
    }
}
