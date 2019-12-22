import java.util.Scanner;

class Tables2{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        fun(n,m);
    }
    static void fun(int a,int b){
        for(int i=1;i<=b;i++)
        {
         System.out.println(a+"*"+i+"="+(a*i));
        }
    }
}