import java.io.*;
import java.util.*;
class Anagram {
    public static void main(String args[]) {
        System.out.println("enter 1st string:");
        Scanner inp = new Scanner(System.in);
        String str1 = inp.next();
        System.out.println("enter 2nd string:");
        String str2 = inp.next();
        // convert string into character and store in array
        char[] ArrS1 = str1.toLowerCase().toCharArray();
        char[] ArrS2 = str2.toLowerCase().toCharArray();
        // to sort the character in array
        Arrays.sort(ArrS1);
        Arrays.sort(ArrS2);
        boolean anagram = Arrays.equals(ArrS1, ArrS2);
        // to check whether anagram or not
        if (anagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
