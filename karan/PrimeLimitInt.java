import java.util.*;
import java.math.*;

class PrimeLimitInt{
    public static void main(String[] args) {
        int n;
        n=Integer.MAX_VALUE;
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                System.out.print(i+"\t");
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
