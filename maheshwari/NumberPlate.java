//Sum of integers from a number plate
import java.util.*;
public class NumberPlate{

public static void main(String[] args) {
int sum=0,i;
Scanner sc=new Scanner(System.in);
String s = sc.nextLine();
for(i=0; i<s.length(); i++) {
    char temp = s.charAt(i);
    if (Character.isDigit(temp)) {
        int b = Integer.parseInt(String.valueOf(temp));
        sum=sum+b;
    }
}
System.out.println(sum);
}
}