import java.util.*;
class Main
{
    public int recur(int num)
    {
       s
        if(num==1)
        {
            return 1;
        }
        else
        return num*(recur(num-1));
    }
}
class Recur
{
    public static void main(String[] args)
    {
        Main m=new Main();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.print(m.recur(n));

    }
}