import java.util.Scanner;

public class Tables {

    public static void main(String[] args)
    {
       int n;
       Scanner s=new Scanner(System.in);
       n=s.nextInt();
       for(int i=1;i<=n;i++)
       {
           for(int j=1;j<=n;j++)
           {
               System.out.println(i+"*"+j+"= "+i * j);
           }
       }
    }
}
