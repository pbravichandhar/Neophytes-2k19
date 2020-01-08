import java.util.*;
import java.lang.*;

class WaterBaloon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraysize = sc.nextInt();
        int[] arr = new int[arraysize];
        int count=0;
        if(arraysize%2 == 0) {
            System.out.println("Enter the valid array input");
        }
        else {
            for(int i = 0 ; i < arraysize ; i++) {
                arr[i] = sc.nextInt();
                if(arr[i] ==0)
                count++;
            }
            if(arraysize%2 == 1 && arr[(arraysize/2)] != 0 && count == arraysize-1 && arr[(arraysize/2)] > 0) {
                for(int i = (arraysize/2) ; i > 0 ; i--) {
                    if(arr[i] != 0)
                    arr[i-1] = arr[i] - 1;
                }
                for(int i = (arraysize/2) ; i<arraysize-1 ; i++) {
                    if(arr[i] != 0)
                    arr[i+1] = arr[i] - 1;
                }
                for(int i=0;i<arraysize;i++) {
                    System.out.println(arr[i]);
                }
            }
            else if(arr[(arraysize/2)] == 0 && count == arraysize) {
                for(int i=0;i<arraysize;i++)
                System.out.print(arr[i]);
            }
            else if(count > 1 || count == 0) {
                System.out.println("Invalid input");
            }
        }
    }
}
