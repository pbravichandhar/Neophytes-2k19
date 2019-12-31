//implementing thread using Runnable interface
class InterfaceThread implements Runnable {
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        InterfaceThread m1 = new InterfaceThread();
        Thread t1 = new Thread(m1); // creating object for thread
        t1.start();
    }
}