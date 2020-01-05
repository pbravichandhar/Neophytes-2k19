// Java program to demonstrate 
// NumberFormatException 
class NumberFormatException {
    public static void main(String args[]) {
        try {
            // "visu" is not a number
            int num = Integer.parseInt("visu");

            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception");
        }
    }
}
