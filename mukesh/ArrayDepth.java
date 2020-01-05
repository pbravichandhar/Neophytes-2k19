import java.util.*;
public class ArrayDepth{
    public static void DepthOfArray(String str)
    {
        int length=str.length();
         int depth=0,max=0;
         for(int index=0;index<length;index++)
         {
             if(str.charAt(index)=='[')
             {
                 depth++;                    //finding depth of Array
             }
             else if(str.charAt(index)==']')
             {
                 depth--;
             }
             if(depth>max)
             {
                 max=depth;                   //finding maximum depth of Array
             }

         }
        System.out.println(max);
    }

     public static void main(String []args){
         Scanner sc=new Scanner (System.in);
         System.out.println("Enter the Array");
         String str=sc.next(); //Getting input as string
         DepthOfArray(str);
     }
}