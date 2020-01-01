import java.util.*;
class main
{
    int a=10;
    void aa()
    {
    System.out.println(a);
    }
    
}
class sub extends main
{
    int a=20;
    void call()
    {
     System.out.println(super.a);
    }
}
class SUper
{
    public static void main(String[] args)
    {
        sub s=new sub();
        s.call();
    }
}