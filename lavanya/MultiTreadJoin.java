class MultiThreadJoin extends Thread {
    public void run() {
        System.out.println("Hai..");

        try {
            Thread.sleep(5000);
        } catch (Exception e) {

        }
        System.out.print("Lavanya..");
    }

    public static void main(String args[]) {
        MultiThreadJoin t1 = new MultiThreadJoin();
        MultiThreadJoin t2 = new MultiThreadJoin();
        // join method()
        t1.start();
        try {
            t1.join(500);
        } catch (Exception e) {
        }
        t2.start();
    }
}
