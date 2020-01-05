import java.util.Scanner;
class main
{
    public void tab(int a,int b)
    {
        for(int i=1;i<=b;i++)
        {
            System.out.println(i+" x "+a+" = "+i*a);
        }
    }
}
    
public class table1
{
    public static void main(String[] args)
    {
        main t=new main();
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        
        t.tab(a,b);
    }
}