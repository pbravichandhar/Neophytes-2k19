import java.util.Scanner;

public class UniqueCharacter {
    public static void getString(Scanner sc) {
        try {
            String str = sc.next();
            int length = str.length();
            int[] arr = new int[length];
            int num = 0,
            index1,
            index;
            String str1 = "";
            for (index = 0; index < length; index ++) {

                if (str1.contains(str.charAt(index) + "")) {
                    index1 = str.indexOf(str.charAt(index));
                    arr[index] = arr[index1];
                } else {
                    arr[index] = num;
                    num ++;
                }
                str1 = str1 + str.charAt(index) + "";

            }
            printMap(arr);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void printMap(int[] num) {
        for (int ans : num) {
            System.out.print(ans + " ");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the String :");
        Scanner sc = new Scanner(System. in);
        getString(sc);
    }
}
