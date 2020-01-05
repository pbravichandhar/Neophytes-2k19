import java.util.*;
class main
{
    public void arr(int[] arr,int c)
    {
        int flag=0;
        for(int i=0;i<arr.length;i++)
        {
            while(arr[i]!='\0')
            {
                if(c==(arr[i]%10))
            {
                flag++;
                break;
            }
            else
            {
                arr[i]=(arr[i]/10);
            }
            }   
        }
        if(flag>=1)
        {
            System.out.println("yes");
        }
        else
            System.out.println("No");
    }
}
public class arr2
{
    public static void main(String[] args)
    {
        main t=new main();
        Scanner s=new Scanner(System.in);
        int c=s.nextInt();
        int n=s.nextInt();
        int[] ar=new int[n];
            for(int i=0;i<n;i++)
                {
                    ar[i]=s.nextInt();
                }    
        t.arr(ar,c);
    }    
}