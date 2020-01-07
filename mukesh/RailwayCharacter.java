import java.util.*;
public class RailwayCharacter
{
    public static void GetInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of Array");
                                                                             //using try ,catch block....
        try                                                                  
        {
            int len=sc.nextInt();
            System.out.println("Enter the Array");                           //Geting Array....
            String []arr=new String[len];
            String str="";
            for(int index=0;index<len;index++)
            {
                arr[index]=sc.next();
                if(index!=0&&arr[index].charAt(0)!=arr[index-1].charAt(arr[index-1].length()-1))    //Checking the condition...
                {
                    System.out.println("Invalid Input");                     
                    System.exit(0);
                }
                if(str.contains(arr[index]))
                {
                    System.out.println("Invalid Input");
                    System.exit(0);
                }
                str=str+arr[index]+" ";
            }
            System.out.println("Valid Input");

        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
     public static void main(String[] args) {
         GetInput();
        
    }
}

