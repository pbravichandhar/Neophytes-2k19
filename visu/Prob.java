import java.util.*;

public class Prob { //begining
    public static void main(String args[]) {
        int i, d, n, r, x, ch = 0;
        float cir, da;
        Scanner sc = new Scanner(System.in);
        d = sc.nextInt();
        for (i = 1; i <= d; i++) {
            r = sc.nextInt();
            x = sc.nextInt();
            cir = 22 / 7 * 2 * r;
            da = 100 * x;
            if (da >= cir) {
                ch++;
            }

        }
        System.out.println(ch);
    }
}