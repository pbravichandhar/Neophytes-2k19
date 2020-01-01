class SharedResource extends Thread
{
    synchronized public void run(int a)
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(i*50);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
class Thread1 extends Thread
{
    Thread1(SharedResource call)
    {
        call.run(50);
    }
}
class Thread2 extends Thread
{
    Thread2(SharedResource call)
    {
        call.run(100);
    }
}
public class Synchronisation {
    public static void main(String[]args)
    {
        SharedResource sharedResource=new SharedResource();
        Thread1 t1=new Thread1(sharedResource);
        Thread2 t2=new Thread2(sharedResource);
        t1.start();
        t2.start();
    }
}
