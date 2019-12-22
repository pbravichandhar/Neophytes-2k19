import java.util.*;
public class Animals
{
    public static int total( int p, int q, int r)
    {
       int m=2*p+4*q+4*r;
        return m;
    }
    public static void main(String[] args)
    {
         int chickens,cows,pigs;
         Scanner a=new Scanner(System.in);
        chickens=a.nextInt();
        cows=a.nextInt();
        pigs=a.nextInt();
      System.out.println(total(chickens,cows,pigs));
    }
}