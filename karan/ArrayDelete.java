import java.io.*;
import java.util.*;
class ArrayDelete {
	public static void main(String[] args) {
		int i,n,c,p,j=0;
		int a[]=new int[50];
		int b[]=new int[50];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n : ");
		n=sc.nextInt();
		System.out.println("Enter the array elements :");
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the location to delete : ");
		p=sc.nextInt();
		for(i=0;i<n;i++){
			if(i!=(p-1)){
				b[j]=a[i];
				j++;
			}
		}
		System.out.println("After deletion : ");
		for(i=0;i<n-1;i++){
			System.out.println(b[i]);
		}
	}
}
