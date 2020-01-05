
import java.util.Arrays;
import java.util.Scanner;

public class Regex {


    public static void main(String[] args) {

        int max=0;
        Scanner inp=new Scanner(System.in);
        String a=inp.nextLine();
        String[] arr=a.split("[\\s@#$%^&*()!123456789]");
        for(String s:arr)
        {

            if(s.length()>max)
            {
                max=s.length();
            }

        }
        System.out.println(max);
    }
}
