import java.util.*;
class prime
{
    public static void main(String[] args)
    {
        int count=0;
        //Scanner sc=new Scanner(System.in);
        //int num=sc.nextInt();

        for(int i=2;i<=Integer.MAX_VALUE;i++)
        {
            count=0;
            for(int j=i;j>0;j--)
            {
                if(i%j==0)
                {
                    count++;
                    //System.out.println(count);
                }
            }
            if(count==2)
            System.out.print(i+" ");

        }
    }
}