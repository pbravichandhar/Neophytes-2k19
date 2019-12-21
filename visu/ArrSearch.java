
//Search a given number in the array elements
import java.util.Scanner;

public class ArrSearch {

    public static void main(String[] args) {
        int n, search, res = 0, f = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        search = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (a[i] == search) {
                a[i] = 0;
                f = 1;
            } else {
                while (a[i] > 0) {
                    res = a[i] % 10;
                    a[i] /= 10;
                    if (res == search || a[i] == search) {
                        a[i] = 0;
                        f = 1;
                    }
                }

            }
        }
        if (f == 0) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}
