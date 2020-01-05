//program to demonstrate the use of foreach
public class Enhancefor {
    public static void main(String[] args) {
        int[] a = { 2, 3, 4, 5 };
        for (int i : a) {
            System.out.println(i);
        }
        String[] s = { "dhoni", "msd", "mahi" };
        for (String m : s) {
            System.out.println(m);
        }
    }
}