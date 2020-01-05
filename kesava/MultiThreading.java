class Threading extends Thread
{
    @Override
    synchronized public void run() {
        int i = 0;
        while (i < 5)
        {
            System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
        try {

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            i++;

        }
    }
}

class RunnableThread implements Runnable
{

    @Override
    public void run()
    {
        int i = 0;
        while (i < 5)
        {
            System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
            try {

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;


        }
    }
}
public class MultiThreading {
    public static void main(String[]args)
    {
          Threading t1=new Threading();
          Threading t2=new Threading();
          RunnableThread r2=new RunnableThread();
          Thread thread=new Thread(r2);
          t2.setPriority(10);
          t1.setPriority(1);
          thread.setPriority(5);
          t1.setName("Thread class");
          t2.setName("Max priority");
          thread.setName("Runnable Class");
          System.out.println(t1.isAlive()+" "+t2.isAlive()+" "+thread.isAlive());
          t2.start();
          try
          {
              t2.join();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          t1.start();
          thread.start();


    }
}
