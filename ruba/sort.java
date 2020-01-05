import java.util.*;
class main
{
   public void sorting(int[]arr,int size)
    {
        arr=new int[size];
        int temp=0;
        for(int i=0;i<size;i++)
        {
        for(int j=i+1;j<size;j++)
        {
           if(arr[i]>arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        }   
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
class sort
{
    public static void main(String[] args)
    {
        main obj=new main();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int size=arr.length;
        obj.sorting(arr,size);   
    }
}