import java.util.*;

public class PowerfulNumbers {
    private static void GetInput() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the  Number :");
            int input = sc.nextInt();
            for (int index = 2; index <= input / 2; index++) {
                if (input % index == 0) {
                    int PrimeFactor = FindPrimeFactor(index, input);
                    if (PrimeFactor != 0) {
                        if (input % (PrimeFactor * PrimeFactor) != 0) {
                            System.out.println("False");
                            System.exit(0);
                        }
                    }
                }
            }
            System.out.println("True");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private static int FindPrimeFactor(int in, int input) {
        int flag = 0;
        for (int index = 2; index <= in / 2; index++) {
            if (in % index == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            return in;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        GetInput();
    }
}
