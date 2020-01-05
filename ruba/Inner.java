import java.util.*;
classs Outer
{
    public outer()
    {
        System.out.println("outer class");
    }
    class Inner
    {
        public inner()
        {
            System.out.println("inner class");
        }
    }
    //Inner n=new Inner();
    //n.inner();
}
class Main
{
    public static void main(String[] args) 
    {
        Outer o=new Outer();
        o.outer();   
    }
}