import java.util.*;

class Fibonacci {

    public static int min(int x, int y) {
        return (x <= y) ? x : y;
    }

    public static int fibMonaccianSearch(int arr[], int x, int n) {
        int fibMMm2 = 0;
        int fibMMm1 = 1;
        int fibM = fibMMm2 + fibMMm1;

        while (fibM < n) {
            fibMMm2 = fibMMm1;
            fibMMm1 = fibM;
            fibM = fibMMm2 + fibMMm1;
        }

        int offset = -1;

        while (fibM > 1) {
            int i = min(offset + fibMMm2, n - 1);

            if (arr[i] < x) {
                fibM = fibMMm1;
                fibMMm1 = fibMMm2;
                fibMMm2 = fibM - fibMMm1;
                offset = i;
                // System.out.println(fibM+"\n"+fibMMm1+"\n"+fibMMm2+"\n"+offset+"\n");
            }

            else if (arr[i] > x) {
                fibM = fibMMm2;
                fibMMm1 = fibMMm1 - fibMMm2;
                fibMMm2 = fibM - fibMMm1;
                // System.out.println(fibM+"\n"+fibMMm1+"\n"+fibMMm2+"\n");

            } else
                return i;

            System.out.println("Search index : " + i + "    arr[i] : " + arr[i]);

        }

        if (fibMMm1 == 1 && arr[offset + 1] == x) {
            return offset + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21 34....,
        Scanner sc = new Scanner(System.in);
        int arr[] = { 10, 20, 30, 40, 45, 50, 80, 82, 85, 90, 100 };
        int n = arr.length;
        int x = sc.nextInt();
        System.out.print("Found at index: " + fibMonaccianSearch(arr, x, n));
    }
}
