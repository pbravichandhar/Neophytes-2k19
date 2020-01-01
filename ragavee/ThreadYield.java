import java.lang.*;

class ThreadYield extends Thread{
    public void run(){
        for(int i=0;i<3;i++)
        System.out.println(Thread.currentThread().getName()+"running");
        System.out.println(Thread.currentThread().getId()+"running");
    }
    public static void main(String args[]){
        ThreadYield t1=new ThreadYield();
        ThreadYield t2=new ThreadYield();
        t1.start();
        t2.start();
        for(int i=0;i<3;i++){
            t1.yield();
            System.out.println(Thread.currentThread().getName()+"running");
            System.out.println(Thread.currentThread().getId()+"running");
        }
    }
}