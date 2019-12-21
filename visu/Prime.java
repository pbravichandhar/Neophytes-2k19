//program to find prime numbers upto integer max value
public class Prime {
    public static void main(String[] args) {
        int n = Integer.MAX_VALUE;
        for (int i = 2; i <= n; i++) {
            int c = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    c++;
                }
            }

            if (c == 2) {
                System.out.println(i);
            }

        }
    }
}
