import java.util.Scanner;

public class DateArithematic {
    public static void main(String[]args)
    {
        int m1,y1,m2,y2;
        Scanner s=new Scanner(System.in);
        m1=s.nextInt();
        y1=s.nextInt();
        m2=s.nextInt();
        y2=s.nextInt();
        int diff=(y2 - y1) * 12 + (m2 - m1);
        if(diff<0)
        {
            diff*=-1;
        }
        System.out.println(diff);
    }
}
