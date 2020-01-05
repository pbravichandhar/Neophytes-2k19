import java.util.*;

class TableUsingFunction{
    public static void main(String[] args) {
        int a,b,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a :");
        a=sc.nextInt();
        System.out.println("Enter b :");
        b=sc.nextInt();
        fn(a,b);
    }
    public static void fn(int a,int b){
        int i,j;
        for(i=1;i<=a;i++){
            System.out.print("Tables "+i+" : ");
            for(j=1;j<=b;j++){
                System.out.print(" \t "+i+" * "+j+" = "+(i*j));
            }
            System.out.println();
        }
    }
}
