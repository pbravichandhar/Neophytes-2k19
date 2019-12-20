import java.util.*;

public class DifferenceGreater {
    public static void main(String[] args) {
      int n,m,b=0;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      m=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      for(int i=0;i<n;i++){
        if(i==(n-1)){
          b=a[i]-a[0];
          if(b>m)
            System.out.print("1 ");
          else
            System.out.print("0 ");
        }
        else{
          b=a[i+1]-a[i];
          if(b>m)
            System.out.print("1 ");
          else
            System.out.print("0 ");
        }
      }
    }
}
