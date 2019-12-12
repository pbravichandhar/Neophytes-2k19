import java.io.*;
import java.util.*;
class arrayinsertion{
	public static void main(String[] args) {
        int i,n,c,p;
		int a[]=new int[50];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n : ");
		n=sc.nextInt();
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the position to insert the value : ");
		p=sc.nextInt();
		System.out.println("Enter the value : ");
		c=sc.nextInt();
		for(i=n;i>=p;i--){
			a[i]=a[i-1];
			if(i==p){
				a[i-1]=c;
				break;
			}
		}
		for(i=0;i<=n;i++){
			System.out.println(a[i]);
		}
		
	}
}