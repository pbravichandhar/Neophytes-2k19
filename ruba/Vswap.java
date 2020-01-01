import java.util.*;
class Vswap
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        int count=0,previous=-1,current=-1;
        int n=str1.length();
        for(int i=0;i<n;i++)
        {
            if(str1.charAt(i)!=str2.charAt(i))
            {
                count++;
                previous=current;
                current=i;
                
            }
        }
        if(count==2&& (str1.charAt(previous)==str2.charAt(current))&& (str1.charAt(current)==str2.charAt(previous)))
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}