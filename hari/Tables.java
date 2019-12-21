import java.util.Scanner;
import java.lang.*;
class Tables
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        arraytable(a,b);

    }
    public static void arraytable(int num1,int num2){
        for(int i=1;i<=num1;i++)
        {
                System.out.println(i+"*"+num2+"="+(i*num2));
        }
    }
}