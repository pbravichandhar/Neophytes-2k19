import java.util.Scanner;

public class Prime {



    public static void main(String[]args)
    {
        int count=0;
        int a=Integer.MAX_VALUE;
        System.out.println(a);
        for(int i=1;i<=a;i++)
        {

            count=0;
            for(int j=i;j>=1;j--)
            {
              if(i%j==0)
              {
                  count+=1;
              }
            }
            if(count==2)
            {
                System.out.print(i+" ");

            }

        }

        }
    }


