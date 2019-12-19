import java.util.*;
class Foreach
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int sum=0;
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int n:arr)
        {
            sum=sum+n;
        }
        System.out.println(sum);
    }
}