import java.io.*;
import java.util.*;
class BudgetOfProducts{
	public static void main(String[] args) {	
		int a,b,c,d,e;
		double br=350.34,vs=230.90,as=190.55,ar=125.30,le=180.90,tc=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		tc=(a*br)+(b*vs)+(c*as)+(d*le)+(e*le);
		if(tc<=15000){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}
