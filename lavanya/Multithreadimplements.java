class MyThread implements Runnable {
    public void run() {
        System.out.println("Hai...");
    }
}

class Multithread {
    public static void main(String args[]) {
        MyThread mt = new MyThread();
        Thread t = new Thread(mt);
        t.start();
    }
}
