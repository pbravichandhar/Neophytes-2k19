import java.util.Scanner;

public class PowerfulNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s, flag = 0, count = 0;
        if (n == 1) {
            System.out.println("Powerful Number");
        } else if (n > 2) {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    for (int p = 2; p <= n / 2; p++) {
                        if (i % p == 0) {
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 1) {
                        s = i * i;
                        if (n % s == 0) {
                            count++;
                        }
                    }
                }
            }
        }
        if (count != 0) {
            System.out.println("powerful Number");
        } else {
            System.out.println("Not a powerful number");
        }

    }
}