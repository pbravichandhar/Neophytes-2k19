import java.io.*;
import java.util.*;
class A
{
  public void display()
  {
   System.out.println("Parent class");
  }
}
class B extends A
{
  public void show()
  {
   System.out.println("Child class");
  }
}
class C extends B{
  public void display1()
  {
    System.out.println("child class");
  }
}
class Inheritance 
{
  public static void main(String[] args)
   {
     /* B obj = new B();
      obj.display();
      obj.show();*/
      C obj1 =new C();
      obj1.display();
      obj1.display1();
      obj1.show();
    }
  }
