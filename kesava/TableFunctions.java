import java.util.Scanner;

public class TableFunction {

    static void tables(int a, int b) {
        for (int i = 1; i <= a; i++) {
            System.out.println();
            for (int j = 1; j <= b; j++) {
                System.out.print(i + "*" + j + "= " + i * j + '\t');
            }
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, m;
        n = s.nextInt();
        m = s.nextInt();
        tables(n, m);
    }
}
