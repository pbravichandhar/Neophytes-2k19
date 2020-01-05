import java.util.*;
class Main
{
    int ans;
    Main(double a)
    {
        int i=(int)(a+10);
        System.out.println(i);
    }
    Main(int a)
    {
        ans=a;
        System.out.println(a);
    }
    Main(Main a)
    {
     System.out.println(a.ans); 
    }
}
class Constructor
{
    public static void main(String[] args)
    {
        Main m=new Main(10.9);
        Main n=new Main(19);
        Main o=new Main(n);
    }
}