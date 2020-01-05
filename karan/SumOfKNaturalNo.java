import java.util.*;

public class SumOfKNaturalNo {
    public static void main(String[] args) {
      int a,n=0;
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      if(n<=100000){
      	for(int i=1;i<=a;i++){
      	  n=i+n;
      	}
      	System.out.println(n);
      }
    }
}
