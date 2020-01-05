class RunnableDem implements Runnable
{
    private Thread t1;
    private String threadNam;
    RunnableDem( String name)
    {
        threadNam = name;
        System.out.println("Thread Creating " +  threadNam );
    }
    public void run() {
        System.out.println("Thread Running " +  threadNam );
        try
        {
            for(int x = 4; x> 0; x--)
            {
                System.out.println("Thread: " + threadNam + ", " + x);
                Thread.sleep(50);
            }
        }catch (InterruptedException e) {
                System.out.println(" Intruppted Thread " +  threadNam + " interrupted.");
            }
                System.out.println("Thread " +  threadNam + " exit.");
    }
    public void start ()
    {
        System.out.println("Starting " +  threadNam );
        if (t1 == null)
        {
            t1= new Thread (this, threadNam);// New Thread is created
            t1.start ();//run method is called
        }
    }
}
class thread {
    public static void main(String args[]){
        RunnableDem run1 = new RunnableDem( "Thread_1");//Object of Class is created
        run1.start();//Start method is called
        RunnableDem run2= new RunnableDem( "Thread_2"); // 2nd Object is  created
        run2.start(); // start method is called
    }
}
