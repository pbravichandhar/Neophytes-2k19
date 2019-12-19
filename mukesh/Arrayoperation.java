import java.util.*;
public class Arrayopration
{
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
	    System.out.println("Enter the length of Array");
	    int len=sc.nextInt();
            int []arr=new int[len];
	    System.out.print("Enter the Array");
            for(int index1=0;index1<len;index1++)
            {
                arr[index1]=sc.nextInt();
            }
        System.out.print("add"+"\n"+"mul"+"\n"+"sub"+"\n"+"div"+"\n"+"remainder"+"\n");
	    String input=sc.next();
	    for(int index=0;index<len-1;index++)
	    {
	        if(input.equals("add"))
	        {
	            System.out.print(arr[index]+arr[index+1]+" ");
	        }
	        else if(input.equals("mul"))
	        {
	            System.out.print(arr[index]*arr[index+1]+" ");
	        }
	        else if(input.equals("sub"))
	        {
	            System.out.print(arr[index]-arr[index+1]+" ");
	        }
	        else if(input.equals("div"))
	        {
	            System.out.print(arr[index]/arr[index+1]+" ");
	        }
	        else if(input.equals("remainder"))
	        {
	            System.out.print(arr[index]%arr[index+1]+" ");
	        }
	    }
		
	}
}