import java.util.*;
class Table{
    public void print(int a,int b){
        int i;
        for(i=1;i<=b;i++){
            System.out.println(i+" x "+a+" = "+i*a);
        }
    }
}
public class CustomTable{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a,b;
        System.out.println("Input:");
        a=scan.nextInt();
        b=scan.nextInt();
        Table t=new Table();
        t.print(a,b);
    }
}