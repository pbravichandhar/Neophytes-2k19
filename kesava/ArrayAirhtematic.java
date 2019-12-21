import java.util.Scanner;

public class ArrayAirhtematic {

    public static void main(String[]args)
    {
        int n=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Number of elements in the array");
        n=s.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            if(i!=n-1)
                {
                  System.out.println((arr[i]+"+"+arr[i+1]+"= "+(arr[i]+arr[i+1]))+"\t"+(arr[i]+"-"+arr[i+1]+"= "+(arr[i]-arr[i+1]))
                          +"\t"+(arr[i]+"*"+arr[i+1]+"= "+(arr[i]*arr[i+1]))+"\t"+(arr[i]+"/"+arr[i+1]+"= "+(arr[i]/arr[i+1]))
                           +"\t"+(arr[i]+"%"+arr[i+1]+"= "+(arr[i]%arr[i+1])));
                }
        }
    }
}
