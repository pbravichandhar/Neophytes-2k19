import java.util.*;
class Primenumbers
{
    public static void main(String[] args)
    {
        int flag=0,j,i,a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the lowest limit:");
         a=s.nextInt();
         System.out.println(Integer.MAX_VALUE);
         b=s.nextInt();
        System.out.println("the prime numbers between entered values:");
        for(i=a;i<=b;i++)
        {
            //int count=0;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=0;
                    break;
                }
                else
                {
                    flag=1;
                }
            }
            if(flag==1)
            {
                System.out.println(i);
            }
        }
    }
}