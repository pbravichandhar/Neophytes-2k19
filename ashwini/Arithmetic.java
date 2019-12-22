import java.util.*;
 class Arithmetic
{
public static void main(String[] args)
    { 
    int n,i;
    System.out.println("Please enter the n:");
    Scanner s=new Scanner(System.in);
     n=s.nextInt();
    int[] a=new int[n];
        int Addition[]=new int[n-1];
        int Subtraction[]=new int[n-1];
        int Multiplication[]=new int[n-1];
        int Division[]=new int[n-1];
        //System.out.println("Enter " + n + "elements of an array:");
        for(i=0;i<n;i++)
    {
     a[i]=s.nextInt();
    }
    for(i=0;i<n;i++)
    {
       if(i!=n-1)
        {
           Addition[i]=a[i] + a[i+1];
            Subtraction[i]=a[i] - a[i+1];
            Multiplication[i]=a[i] * a[i+1];
            Division[i]=a[i] / a[i+1];
        System.out.println( Addition[i]);
        System.out.println(Subtraction[i]);
        System.out.println(Multiplication[i]);
        System.out.println(Division[i]);
        }
    }
    }
}
