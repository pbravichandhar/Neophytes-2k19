import java.util.*;

class FactorialByReccursion{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(facto(n));
    }
    public static int facto(int a){
        if(a==1){
            return 1;
        }
        else{
            return (facto(a-1)*a);
        }
    }
}
