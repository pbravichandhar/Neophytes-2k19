//program to implement Arithmetic exception
public class Exc {
    public static void main(String args[]) {
        try {
            int data = 100 / 0;
            System.out.println("rest of the code...");

        } catch (ArithmeticException e) {
            System.out.println(e);
        }

    }
}
