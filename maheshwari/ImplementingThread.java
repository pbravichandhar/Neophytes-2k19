/*class ImplementingThread extends Thread{
    public void run(){
        System.out.println("Thread is running....");
    }*/
class ImplementingThread implements Runnable{
    public void run(){
        System.out.println("Thread is Running....");
    }
    public static void main(String args[]){
        ImplementingThread td=new ImplementingThread();
        //td.start();
        Thread tr=new Thread(td);
        tr.start();
    }
}