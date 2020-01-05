import java.util.*;
class pattern
{
    public static int len(String s)
    {
        int ret=0,count=0;
        for(int i=0;i<s.length();i++)
        {
        if(s.charAt(i)!=32)
        {
            count++;
        }
        else
        {
          //ret=Math.max(ret,count);
          if(ret<count)
          {
              ret=count;
          }
          count=0;
        }
    }
        
        
        return Math.max(ret,count);
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);

        int l=0,le=0;
        String str=s.nextLine();
        l=(len(str))+4;

        String []arr=str.split("\\s");
        for(String ab: arr){
            le++;
        }
        le=le+2;
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                   if(i==0||i==le||j==0||j==le)
                   {
                       System.out.print("*");
                   }
                   if(j==1||j==l-1)
                   {
                       System.out.print(" ");
                   }
                   //else 
                   //{
                     // System.out.print(" ");
                     //for(int k=0;k<le;k++)
                     //{
                       // System.out.print(arr[k]);
                     //} 
                    //}
            }
                   System.out.println();
                   
            }
    }
}