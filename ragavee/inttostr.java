import java.util.Scanner;
import java.util.Arrays;
import java.lang.*;
class Inttostr
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=s.nextInt();
        }
        String str=Arrays.toString(arr);
        int key=s.nextInt();
        String str1=Integer.toString(key);
        if(str.contains(str1))
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}