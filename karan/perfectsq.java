import java.util.*;

public class perfectsq {
    public static void main(String[] args) {
      int n,m,a,c=0;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      m=sc.nextInt();
      a=n*m;
      for(int i=1;i<=n;i++){
        if(i*i==a){
          c=1;
          break;
        }
      }
      if(c==1)
      	System.out.println("yes");
      else
        System.out.println("no");
    }
}
