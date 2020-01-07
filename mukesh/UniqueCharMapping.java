import java.util.Scanner;

public class UniqueCharMapping {
    public static void GetInput(Scanner sc) {
        try {
            String str = sc.next();
            int len = str.length();
            int[] arr = new int[len];
            int num = 0;
            String str1 = "";
            for (int index = 0; index < len; index++) {

                if (str1.contains(str.charAt(index) + "")) {
                    int index3 = str.indexOf(str.charAt(index));
                    arr[index] = arr[index3];
                } else {
                    arr[index] = num;
                    num++;
                }
                str1 = str1 + str.charAt(index) + "";

            }
            Printt(arr);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void Printt(int[] arr) {
        for (int ans : arr) {
            System.out.print(ans + " ");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the String :");
        Scanner sc = new Scanner(System.in);
        GetInput(sc);
    }
}