import java.io.*;
import java.util.Scanner;
class Factorial
{
	public static void main(String[] args) {
		int i,n,fact=1;
		System.out.println("n:");
		Scanner inp = new Scanner(System.in);
		n=inp.nextInt();
		for(i=1;i<=n;i++)
		{
			fact*=i;
		}

System.out.println(fact);
		
	}
}

