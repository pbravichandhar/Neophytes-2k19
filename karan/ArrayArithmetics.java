import java.util.*;

class ArrayArithmetics{
    public static void main(String[] args) {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Addition \t Subtraction \t Multiplication \t Division \t Remainder ");
        for(i=0;i<n-1;i++){
            System.out.println((a[i]+a[i+1])+"\t\t  "+(a[i]-a[i+1])+"\t\t  "+(a[i]*a[i+1])+"\t\t\t  "+(a[i]/a[i+1])+"\t\t  "+(a[i]%a[i+1]));
        }
    }
}
