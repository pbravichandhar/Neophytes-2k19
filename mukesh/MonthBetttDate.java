import java.util.*;
public class MonthBetttDate
{
    public static void fun()
   {
       	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the 1st Date/Month");
		int d1=sc.nextInt();
		int m1=sc.nextInt();
		System.out.println("Enter the 2st Date/Month");
		int d2=sc.nextInt();
		int m2=sc.nextInt();
		String [] month={"January","February","March","April","May","June","July","August","September","October","November","December"};
		int index=0;
		for(String str:month)             //Using for each loop.
		{
		    index++;
		    if(m1<=index&&m2>=index)
		    {
		        System.out.println(str);
		    }
		}
   }
	public static void main(String[] args) {
	    fun();
	










	}
}
