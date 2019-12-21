import java.util.Scanner
Class Multiply
{
    public static void main(String[] args)
    {
        Scanner s=new SCanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            Sysetm.out.println("Multiplication table of" +i);
            for(int j=1;j<=n;j++)
            {
                System.out.println(i+"*"+j+"=" +(i*j));
            }
        }
    }
}
