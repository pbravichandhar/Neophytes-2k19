import java.util.*; 
public class Tables
{
    public static void main(String[] args)
    {
        int n;
        Scanner t=new Scanner(System.in);
        System.out.println("Enter the Tables Number:");
        System.out.println("Enter the last number:");
        int a=t.nextInt();
        int b=t.nextInt();
        cal(a,b);
    }
        public static void cal(int n , int m)
        {
            for(int i=1;i<=m;i++)
            {
                System.out.println(n+" * " +i+ "="+n*i);
            }    
        }
}