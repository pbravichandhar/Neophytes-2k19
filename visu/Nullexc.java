//program to implement nullpointer exception
public class Nullexc {
    public static void main(String[] args) {
        try {
            String s = null;
            s.length();
        } catch (NullPointerException n) {
            System.out.println(n);
        } finally {
            System.out.println("hii");
        }
    }
}