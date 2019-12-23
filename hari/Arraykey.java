//Search the Key exist or not in an array
import java.lang.*;
import java.util.Scanner;
class Arraykey
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int key=s.nextInt();
        int n=s.nextInt();
        int[] arr=new int[n];
        int a,b;
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            a=arr[i];
            while(a!=0)
            {
            b=a%10;
            a=a/10;
            if(key==b)
            {
                System.out.print("Yes");
                return;
            }
            }
        }
    }
}