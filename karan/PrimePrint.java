import java.util.*;
import java.math.*;

class PrimePrint{
    public static void main(String[] args) {
        int n,k=0;
        int a[]=new int[1000];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                a[k]=i;
                k++;
            }
        }
        for(int i=0;i<k;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static boolean isprime(int a){
        for (int i = 2; i < (a); i++) {  
            if (a % i == 0) {  
                return false;  
            }  
        }
        return true;
    }
}
