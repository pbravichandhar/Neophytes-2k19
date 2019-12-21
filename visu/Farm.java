import java.util.Scanner;

public class Farm {
    public static void main(String args[]) {
        int chicken, cow, pig;
        Scanner sc = new Scanner(System.in);
        chicken = sc.nextInt();
        cow = sc.nextInt();
        pig = sc.nextInt();
        System.out.println(Check(chicken, cow, pig));
    }

    static int Check(int p, int q, int r) {
        int m = p * 2 + q * 4 + r * 4;
        return m;
    }
}