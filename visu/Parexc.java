public class Parexc {
    public static void main(String[] args) {
        try {
            String s = null;
            s.length();

        } catch (ArithmeticException a) {
            System.out.println(a);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception st) {
            System.out.println("parent exception occur");
        } finally {
            System.out.println("hii");
        }
    }
}