import java.util.Scanner;
public class Sum
{
    public static void main(String[] args)
    {
        int add=0;
        Scanner s=new Scanner(System.in);
        int N= s.nextInt();
        int[] array=new int[N];
        for(int i=0;i<N;i++)
        array[i]=s.nextInt();
    }
         for(int i=0;i<N;i++)
        add += array[i];
        System.out.println(add);
        s.close();

}