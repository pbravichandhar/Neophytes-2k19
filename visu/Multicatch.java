//program to implement multiple catch
public class Multicatch {
    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            System.out.println(a[10]);
            a[5] = 100 / 0;

        } catch (ArithmeticException a) {
            System.out.println(a);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println("hii");
        }
    }
}