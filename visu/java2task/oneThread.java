
// Java program to illustrate 
// isAlive() function
import java.lang.Thread;

public class oneThread extends Thread {
    public void run() {
        System.out.println("dhoni ");
        try {
            Thread.sleep(300);
        } catch (InterruptedException ie) {
        }
        System.out.println("captain cool");
    }

    public static void main(String[] args) {
        oneThread c1 = new oneThread();
        oneThread c2 = new oneThread();
        c1.start();
        c2.start();
        System.out.println(c1.isAlive());// return true if thread is alive,otherwise false
        System.out.println(c2.isAlive());// return true if thread is alive,otherwise false
    }
}
