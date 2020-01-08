import java.util.InputMismatchException;
import java.util.Scanner;

class PowerfulNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if (n == 1)
                System.out.println("Powerful Number");
            else if( n > 2 ) {
                int num2, count = 0;
                boolean flag = false;
                for (int i = 3; i <= n / 2; i++) {
                    if (n % i == 0) {
                        for (int p = 2; p <= n / 2; p++) {
                            if (i % p == 0) {
                                flag = true;
                                break;
                            }
                        }
                        if (flag) {
                            num2 = i * i;
                            if (n % num2 == 0) {
                                count++;
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

        } catch (InputMismatchException a) {
            System.out.println(a);
        }

    }
}