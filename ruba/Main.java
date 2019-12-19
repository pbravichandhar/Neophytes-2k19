import java.util.*;
class Outer
{
    public void outer()
    {
        System.out.println("outer class");
        Inner n=new Inner();
        n.inner();
    }
    class Inner
    {
        public void inner()
        {
            System.out.println("inner class");
            class InnerInner
            {
                public void innerInner()
                {
                    System.out.println("innerinner class");

                }
            }
            InnerInner n=new InnerInner();
        n.innerInner();
        
        }
    }
   
}
class Main
{
    public static void main(String[] args) 
    {
        Outer o=new Outer();
        o.outer();   
    }
}