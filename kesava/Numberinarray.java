import java.util.Scanner;

public class Numberinarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp = 0,flag=0;
        int check = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {

            temp=arr[i];

            while (temp!=0)
            {
                if (temp % 10 == check) {
                    flag+=1;
                    break;

                } else {
                    temp = temp/10;
                }

            }
        }
        if(flag>=1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
