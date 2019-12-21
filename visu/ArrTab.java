import java.util.Scanner;

public class ArrTab {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int m = sc.nextInt();
        final int n = sc.nextInt();
        check(m, n);
    }

    static void check(final int p, final int q) {
        for (int i = 1; i <= q; i++) {
            int s;
            System.out.println(p + " * " + i + " = " + p * i + "\t");

        }
    }
}