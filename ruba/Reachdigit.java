import java.util.*;
class Reachdigit
{
    static int dig(int n)
    {
        int sum=0,num=0;
        while(n>0)
        {
            num=n%10;
            sum=sum+(num*num);
            n=n/10;

        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num1=dig(n);
        while((num1/10)>0)
        {
           num1= dig(num1);
        }
        if(num1==1)
        {
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }
    }
}
