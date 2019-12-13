//Java program to fingd the position of a character
import java.util.*;
public class Position{
	public static void main(String[] args) {
		 String alphabet = "abcdefghijklmnopqrstuvwxyz";
		int i,index;
		Scanner sc=new Scanner(System.in);
		String p=sc.nextLine();
		for(i=0;i<p.length();i++){
		index=alphabet.indexOf(p.charAt(i));	
		//System.out.print(index+1);	
		System.out.print(alphabet.charAt(index+1));
		//System.out.print(alphabet.indexOf(p.charAt(i)));
	}
}
}
//end