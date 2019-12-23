import java.util.*;
class MultiplicationTable {
    public static void main(String args[]) {
        int i, j, n, ans;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter N:");
        n = inp.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                ans = j * i;
                System.out.printf("%d * %d =%d\n", j, i, ans);
            }
        }
    }
}
