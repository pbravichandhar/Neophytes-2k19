class Interthread
{
    int num;
    boolean ValueSet=false;
    public synchronized void put(int num)
    {
        while(ValueSet)
        {
            try
            {
                wait();
            } 
            catch (Exception e) 
            {
            
            }
        }
        System.out.println("Put: "+num);
        this.num=num;
        ValueSet=true;
        notify();
    }
    public synchronized void get( )
    {
        while(!ValueSet)
        {
            try
            {
                wait();
            } 
            catch (Exception e) 
            {
            
            }
        }
        System.out.println("Get: "+num);
        ValueSet=fasle;
        notify();
    }
}
class Producer implements Runnable
{
    Q q;
    public Producer(Q q)
    {
        this.q=q;
        Thread t=new Thread(this,"Producer");
        t.start();
    }
    public void run()
    {
        int i=0;
        while(true)
        {
            q.put(i++);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {

            }
        }
    }
}
class Consumer implements Runnable
{
    int  q;
    public Consumer(Q q)
    {
        this.q=q;
        Thread t=new Thread(this,"Consumer");
        t.start();
    }
    public void run()
    {
        while(true)
        {
            q.get();
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {

            }
        }
    }
}
