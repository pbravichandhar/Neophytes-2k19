import java.util.Scanner;

public class Table 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) 
        {
            System.out.println("\n");
            for (int j = 1; j <= n; j++) 
            {
                System.out.print(i + " * " + j + " = " + i * j + "\t");
            }
        }
    }
}