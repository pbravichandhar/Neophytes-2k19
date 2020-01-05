
////hello world in a frame program
import java.util.*;

class Frm {
    public static void main(String[] args) 
    {
        int  i = 0, j, n, len, len1 = 0, len2= 0;
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        len= s.length();
        String arr[] = s.split("\\s");
        len2= arr.length;
        for (i = 0; i < len2; i++) 
        {
            if (arr[i].length() > len1) 
            {
                len 1 = arr[i].length();
            }
        }
        len1 += 4;// to find length of the column
        len2 += 2;
        for (i = 0; i < len2; i++) 
        {
            System.out.println();
            for (j = 0; j < len1; j++) 
            {
                if ((i == 0) || (i == len2 - 1))
                {
                    System.out.print("*");
                } else
                {
                    if (j == 0) // to print * first in all rows
                    {
                        System.out.print("*");
                    } else 
                    {
                        if (i != 0 && i != len2 - 1) 
                        {
                            if (j == 1) 
                            {
                                System.out.print(" ");// give whitespace after *
                            }
                            if (j == len1 - 1)// to print whitespace and * at the end
                            {
                                int k = arr[i - 1].length() + 2;
                                int m = len1- k;
                                for (int x = 0; x < m - 1; x++) {
                                    System.out.print(" ");
                                }
                                System.out.print("*");
                            }
                            if (j == 2) // to print string inside the frame
                            {
                                System.out.print(arr[i - 1]);
                            }
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
