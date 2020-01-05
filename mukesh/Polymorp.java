class Parant1
{
   public void fun()
   {
      System.out.println("In Parant Class");
   }
   
}
class Child1 extends Parant1
{
    public void fun()
    {
      System.out.println("In Child Class");
   }
   public void fun(int i)
   {
       System.out.print(i);
   }

}
public class Polymorp
{
    public static void main( String args[]) 
   {
      Child1 obj = new Child1();
      obj.fun();   
      obj.fun(10);
   }
}