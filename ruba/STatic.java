import java.util.*;
class Main
{
    public void method()
    {
        System.out.println("outer class");
    }
}
class Sub extends Main
{
    public void method()
    {
        System.out.println("inner class");
    }
}
class STatic
{
    public static void main(String[] args)
    {
        Sub s=new Sub();
        s.method();       
    }
}