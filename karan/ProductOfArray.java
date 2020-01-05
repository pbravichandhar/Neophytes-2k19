import java.util.*;

class ProductOfArray{
    public static void main(String[] args) {
        int i,n;
        long j=1;
        int mod=1000000007;
        int a[]=new int[1000];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            j=(a[i]*j)%mod;
        }
        System.out.println(j);
    }
}
