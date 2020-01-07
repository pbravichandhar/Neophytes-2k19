import java.util.*;

public class WaterBallon {
    private static void GetInput() // input Get....
    {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Array Length(In Odd)");
            int len = sc.nextInt();
            int[] arr = new int[len];
            int flag = 0;
            int center;
            int incre = 0;
            if (len % 2 == 0) {
                System.out.print("Array length must be ODD");
            } else {
                System.out.println("Enter the Array :");
                for (int index = 0; index < len; index++) {
                    arr[index] = sc.nextInt();
                    if (index != ((len + 1) / 2) - 1 && arr[index] != 0) {
                        flag = 1;
                    }
                    if (arr[index] == 0) {
                        incre++;
                    }
                }
                if (incre == len) {
                    Printt(arr, len);
                }
                center = arr[len / 2];
                System.out.println(flag);
                if (flag == 0) {
                    Functionn(arr, len, center);
                } else {
                    System.out.println("Invalid input2");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void Functionn(int arr[], int len, int center) {
        for (int index = 1; index <= len / 2; index++) {

            arr[(len / 2) + index] = center - index;
            arr[(len / 2) - index] = center - index;
            if (arr[(len / 2) + index] < 0) {
                arr[(len / 2) + index] = 0;
                arr[(len / 2) - index] = 0;
            }
        }
        Printt(arr, len);

        /*
         * For Other case of programe if(arr[0]==0) { Printt(arr,len); } else {
         * System.out.println("Invalid input  1"); }
         */
    }

    public static void Printt(int[] arr, int len) // Array Print
    {
        System.out.println("Output");
        for (int index = 0; index < len; index++) {
            System.out.println(arr[index] + " ");
        }
        System.exit(0);

    }

    public static void main(String[] args) {

        GetInput();

    }

}
