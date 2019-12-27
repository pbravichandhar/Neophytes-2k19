import java.util.*;
public class SumPrime {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = inp.nextInt();
        int flag = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (checkPrime(i)) {
                if (checkPrime(n - i)) {
                    System.out.println("%d=%d+%d", n, i, n - i);
                    flag = 1;
                }
            }
        }
        if (flag)
            System.out.println(n + "can't expressed");
    }

static boolean checkPrime(int num) {
boolean isPrime=true;
for(int i=2;i<=n / 2;i++) {
if(int n%i==0){
isPrime=false;
break;
}
}
return isPrime;
}
}
