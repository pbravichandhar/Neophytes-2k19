import java.util.Scanner;
public class TypeCasting{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        //char ch='C';
        int i;
        //int i=ch;//implicit conversion
        //System.out.println(i);
        System.out.println("Input:");
        i=scan.nextInt();
        //char ch=(char)i;
        //double ch=(double)i;
        //float ch=(float)i;
        long ch=(long)i;
        System.out.println(ch);
        
    }
}