import java.util.*;
import java.math.*;

class Prime{
    public static void main(String[] args) {
        int n,k=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
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
