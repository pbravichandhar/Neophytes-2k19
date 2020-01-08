import java.io.*;
import java.util.*;

class ValidateSwapFinal{

    public static void main(String[] args) {

        int totalarray,lengthofsinglearray,count;
        String checkarray;
        String array[] = new String[10];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the total number of arrays : ");
        totalarray = sc.nextInt();
        
        System.out.println("Enter the arrays : ");
        for(int i = 0; i < totalarray; i++) {
            array[i] = sc.next();
        }
        
        System.out.println("Enter the string to validate swap : ");
        checkarray = sc.next();
        count = 0;
        
        for(int i = 0; i < totalarray; i++) { 
            if(array[i].length() != checkarray.length()) {
                System.out.println("Strings Are Not Same...");
                break;
            }
            for(int j = 0; j < totalarray; j++) {
                if(array[i].charAt(j) == checkarray.charAt(j)) {
                    count++;
                }
            }
            if((count > 2 || count > 0) && count != 2) {
                System.out.println("false");
            }
            else {
                System.out.println("true");
            }
            count = 0;
        }
    }
}
