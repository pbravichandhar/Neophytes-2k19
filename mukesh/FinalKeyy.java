public class FinalKeyy {
    public static void main(String[] args) {
        final int vari = 10;
        try {
            int vari1 = 1 / 0;
        } catch (Exception e) {
            System.out.println(e);

        } finally {
            System.out.println("in Finally Block");
        }
    }
}
