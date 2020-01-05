//program to implement ArrayIndexOutofbound exception
public class Arrexc {
    public static void main(String[] args) {
        try {
            int[] a = { 1, 2, 3, 4, 5 };
            System.out.println(a[10]);
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println(a);
        } finally {
            System.out.println("hii");
        }
    }
}
