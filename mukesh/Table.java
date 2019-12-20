import java.util.*;
class Table 
{
    static void multiplicationtable(int input)
    {
        for(int index=1;index<=input;index++)
        {
            for(int index1=1;index1<=input;index1++)
            {
                System.out.print(index+"*"+index1+"="+index1*index+"   ");
            }
            System.out.print("\n");
        }
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
	    int input;
            System.out.println("Enter the table");
	    input=sc.nextInt();
	    multiplicationtable(input);
		
	}
}