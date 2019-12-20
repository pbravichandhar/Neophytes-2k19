import java.util.*;
public class Table2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Table and Number");
		int table=sc.nextInt();
		int num=sc.nextInt();
		for(int index1=0;index1<=num;index1++)
		{
		    System.out.println(index1+"*"+table+"="+index1*table+"  ");
		}
	}
}
