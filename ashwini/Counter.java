class Couonter
{
    int count;
    public void increment()
    {
count++;
    }
}
public static void main(String[] args)
{
    Counter c=new Counter();
    Thread t1=new Thread(new runnable()
    {
        public void run()
        {
            for(int i=1;i<1000;i++)
            {
                c.increment();
            }
        }
    });
    Thread t2=new Thread(new runnable()
    {
        public void run()
        {
            for(int i=1;i<1000;i++)
            {
                c.increment();
            }
        }
    });
    t1.start();
    t2.start();
}