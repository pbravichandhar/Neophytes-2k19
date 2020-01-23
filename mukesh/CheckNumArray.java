import java.util.*;

class CheckNumArray {
    public static void GetInput() {
        System.out.println("Enter the length of array");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        String str = "";
        System.out.println("Enter the array");
        for (int index1 = 0; index1 < len; index1++) {
            arr[index1] = sc.nextInt();
            str = str + Integer.toString(arr[index1]);
        }
        System.out.println("Enter the number to find");
        int num = sc.nextInt();

        FindNumInArray(len, arr, str, num);
    }

    public static void FindNumInArray(int len, int arr[], String str, int num) {

        String numstr = Integer.toString(num);
        if (str.contains(numstr)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static void main(String[] args) {
        GetInput();

    }
}
