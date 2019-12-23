import java.util.Scanner;

public class Farmerproblem {

    static int nooflegs(int[]arr)
    {
        int total=(2*arr[0])+(4*arr[1])+(4*arr[2]);
        return total;
    }
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        int[]arr=new int[3];
        System.out.println("Animals count!!");
        for(int i=0;i<3;i++)
        {
            arr[i]=s.nextInt();
        }

        System.out.println("Total no of Legs: "+nooflegs(arr));
    }
}
