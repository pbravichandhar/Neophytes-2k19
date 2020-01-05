public class ThreadDemo
{
public static void main(String[] args)
{
    Hi obj1=new Hi();
    Hello obj2=new Hello();
    obj1.start();
    try {
        {

        }
    } catch (Exception e) {
       
    }
    obj2.start();
}
class Hi extends ThreadDemo
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("hi");
            try{
                Thread.sleep(500);
            }
            catch(Exception e)
            {

            }
        }
    }
}
class Hello extends ThreadDemo
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("hellos");
            try{
                Thread.sleep(500);
            }
            catch(Exception e)
            {

            }
        }
    }
}