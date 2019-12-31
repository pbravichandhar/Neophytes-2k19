
// Java program to illustrate 
// thread without join() 
import java.lang.Thread;

public class oneThread1 extends Thread {
    public void run() {
        System.out.println("msd");
        try {
            Thread.sleep(500);
        } catch (InterruptedException ie) {
        }
        System.out.println("captain cool ");
    }

    public static void main(String[] args) {
        oneThread1 c1 = new oneThread1();
        oneThread1 c2 = new oneThread1();
        c1.start();
        c2.start();
    }
}
