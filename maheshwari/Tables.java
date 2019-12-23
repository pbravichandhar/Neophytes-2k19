import java.util.Scanner;
public class Tables{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Input:");
        int count=1,i;
        int n=scan.nextInt();
        while(count<=n){
            for(i=1;i<=n;i++){
                System.out.println(i+" x "+count+" = "+i*count);
            }
            count++;
        }
    }
}