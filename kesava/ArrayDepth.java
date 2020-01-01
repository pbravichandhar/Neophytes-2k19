import java.util.Scanner;

public class ArrayDepth {
    public static void main(String[]args)
    {
        String a;
        int arraydepth=0,depth=0;
        Scanner s=new Scanner(System.in);
        a=s.next();
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='[')
            {
                arraydepth++;
            }
            if(a.charAt(i)==']')
            {
                arraydepth--;
            }
            if(arraydepth>depth)
            {
                depth=arraydepth;
            }
        }
        System.out.println(depth);
    }
}
