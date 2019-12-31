import java.util.*;
public class Arraydepth
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner (System.in);
        String s1=s.next();
        maxdepth(s1); 
    }
    public static void maxdepth(String str)
    {
        int n=str.length();
        int max=0,present_max=0;
        for(int i=0;i<n;i++)
        {
        if(str.charAt(i)=='[')
        {
        present_max++;
        }
        else if(str.charAt(i)==']')
        {
        present_max--;
        }
        if(present_max>max)
        {
        max=present_max;
        }
        }
        System.out.println(max);
    }
}