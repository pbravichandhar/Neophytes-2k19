class MultiTreadextend extends Thread {
    public void run() {
        System.out.println("Hai..");

        try {
            Thread.sleep(5000);
        } catch (Exception e) {

        }
        System.out.print("Lavanya..");
    }

    public static void main(String args[]) {
        MultiTreadextend t1 = new MultiTreadextend();
        MultiTreadextend t2 = new MultiTreadextend();
        t1.start();
        t2.start();
        // alive method()
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
    }
}
