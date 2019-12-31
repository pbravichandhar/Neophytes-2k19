// Java program to illustrate 
// isAlive() 

public class Alive extends Thread {
    public void run() {
        System.out.println("geeks ");
        try {
            Thread.sleep(300);
        } catch (InterruptedException ie) {
        }
        System.out.println("forgeeks ");
    }

    public static void main(String[] args) {
        oneThread c1 = new oneThread();
        oneThread c2 = new oneThread();
        c1.start();
        c2.start();
        System.out.println(c1.isAlive()); // using isAlive function to find if the thread is runnable or not
        System.out.println(c2.isAlive()); // using isAlive function to find if the thread is runnable or not
    }
}
