import java.util.Scanner;
class Prime
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num=integer.MAX_VALUE;
        for(int i=1;i<num;i++)
        {
            boolean prime=true;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    prime=false;
                    break;
                }
            }
            if(prime)
            System.out.print(i+" ");
        }
    }
}