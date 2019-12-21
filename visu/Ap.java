
//Arithmetic operations on consecutive array elements
import java.util.Scanner;

public class Ap {
    public static void main(String args[]) {
        int n, i;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("addition");
        for (i = 0; i < n - 1; i++) {
            System.out.println(a[i] + a[i + 1]);
        }
        System.out.println("sub");
        for (i = 0; i < n - 1; i++) {
            System.out.println(a[i] - a[i + 1]);
        }
        System.out.println("multiply");
        for (i = 0; i < n - 1; i++) {

            System.out.println(a[i] * a[i + 1]);
        }
        System.out.println("Division");

        for (i = 0; i < n - 1; i++) {
            System.out.println(a[i] / a[i + 1]);
        }

    }
}
