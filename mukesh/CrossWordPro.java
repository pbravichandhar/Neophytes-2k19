import java.util.Scanner;

public class CrossWordPro {
    public static void Printt(char[][] arr, int Row, int Col) {
        for (int index1 = 0; index1 < Row; index1++) {
            for (int index2 = 0; index2 < Col; index2++) {
                System.out.print(arr[index1][index2] + " ");
            }
            System.out.println();
        }
    }

    public static void GetInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row and Col");
        int Row = sc.nextInt();
        int Col = sc.nextInt();
        System.out.println("Enter the 2D Array");
        String str = sc.next();
        char[][] arr = new char[Row][Col];
        int index = 0;
        for (int index1 = 0; index1 < Row; index1++) {
            for (int index2 = 0; index2 < Col; index2++) {
                arr[index1][index2] = str.charAt(index);
                index++;
            }
        }
        Printt(arr, Row, Col);
        System.out.println("Enter The Array length");
        int len = sc.nextInt();
        System.out.println("Enter The Array of String To find in 2D Array");
        String[] strarr = new String[len];
        int[] flag = new int[len];
        for (int index3 = 0; index3 < len; index3++) {
            strarr[index3] = sc.next();
            FindInArray(Row, Col, arr, len, strarr[index3]);
        }
    }

    public static void FindInArray(int Row, int Col, char[][] arr, int len, String str) {
        for (int index1 = 0; index1 < Row; index1++) {
            for (int index2 = 0; index2 < Col; index2++) {
                if (arr[index1][index2] == str.charAt(0)) {
                    FindInRigthTOLeft(arr, str, index1, index2, Row, Col, len);
                    FindInLeftToRigth(arr, str, index1, index2, Row, Col, len);
                    FindInTopToBottom(arr, str, index1, index2, Row, Col, len);
                    FindInBottomToTop(arr, str, index1, index2, Row, Col, len);
                }
            }
        }
    }

    public static void FindInRigthTOLeft(char[][] arr, String str, int index1, int index2, int Row, int Col, int len) {
        int count = 0;
        int index = 0;
        if (index2 + str.length() <= Col) {
            for (int in1 = index2; in1 < Col; in1++) {
                if (str.charAt(index) == arr[Row][in1]) {
                    count++;
                }
                index++;
                if (index == str.length() - 2) {
                    break;
                }

            }
            if (count == str.length()) {
                System.out.println(str + " is Present in 2D Array");
            }

        }

    }

    public static void FindInLeftToRigth(char[][] arr, String str, int index1, int index2, int Row, int Col, int len) {
        int count = 0;
        int index = 0;
        if (index2 - str.length() >= 0) {
            for (int in1 = index2; in1 < Col; in1--) {
                if (str.charAt(index) == arr[Row][in1]) {
                    count++;
                }
                index++;
                if (index == str.length()) {
                    break;
                }

            }
            if (count == str.length()) {
                System.out.println(str + " is Present in 2D Array");
            }

        }

    }

    public static void FindInTopToBottom(char[][] arr, String str, int index1, int index2, int Row, int Col, int len) {
        int count = 0;
        int index = 0;
        if (index1 + str.length() >= Row) {
            for (int in1 = index1; in1 < Col; in1++) {
                if (str.charAt(index) == arr[in1][Col]) {
                    count++;
                }
                index++;
                if (index == str.length()) {
                    break;
                }

            }
            if (count == str.length()) {
                System.out.println(str + " is Present in 2D Array");
            }

        }

    }

    public static void FindInBottomToTop(char[][] arr, String str, int index1, int index2, int Row, int Col, int len) {
        int count = 0;
        int index = 0;
        if (index1 - str.length() >= 0) {
            for (int in1 = index1; in1 < Col; in1--) {
                if (str.charAt(index) == arr[in1][Col]) {
                    count++;
                }
                index++;
                if (index == str.length()) {
                    break;
                }

            }
            if (count == str.length()) {
                System.out.println(str + " is Present in 2D Array");
            }

        }

    }

    public static void main(String[] args) {
        GetInput();

    }
}
