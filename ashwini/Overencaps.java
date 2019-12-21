//encapsulation, overloading constructor, object as parameter
import java.util.*;         
public class Overencaps
{
     private int r=100,n,n1,r1,data1,data2,d1,d2;
     //String s;
    Overencaps( )
    {
        this(4);
      System.out.println(r);
    }
    Overencaps(int n)
    {
        this(n,10);
        n1=r+n;
        System.out.println(n1);
    }
    Overencaps(int f,int s)
    {
       r1=s*f; 
        System.out.println("r1: "+r1); 
    }
    public static void setr(Overencaps obj,int d1,int d2)
    {
    obj.data1=d1;
    obj.data2=d2;
    }
    public  int getr(Overencaps obj)
    {
        System.out.println("data1:  "+obj.data1);
        System.out.println("data2:  "+obj.data2);
        return n;
    }
    public static void main(String[] args)
    {
        Overencaps obj=new Overencaps();
        //obj.Overencaps(5);
        //obj.Overencaps(5,"sa");
       // obj.setr(obj,20,30);
        // System.out.println(obj.getr(obj));
    }
}