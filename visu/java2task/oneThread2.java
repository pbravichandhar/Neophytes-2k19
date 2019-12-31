
// Java program to illustrate join()
import java.lang.Thread;

public class oneThread2 extends Thread {
    public void run() {
        System.out.println("msd ");
        try {
            Thread.sleep(300);
        } catch (InterruptedException ie) {
        }
        System.out.println(" captain cool");
    }

    public static void main(String[] args) {
        oneThread2 c1 = new oneThread2();
        oneThread2 c2 = new oneThread2();
        c1.start();

        try {
            c1.join(); // Waiting for c1 to finish
        } catch (InterruptedException ie) {
        }

        c2.start();
    }
}
