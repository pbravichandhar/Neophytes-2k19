import java.util.*;

class ToggleString {
    public static void main(String args[]) {
        try {
            Scanner inp = new Scanner(System.in);
            System.out.println("enter string:");
            String s = inp.next();
            char[] arr = s.toCharArray();
            int l = s.length();
            for (int i = 0; i <= l; i++) {
                if (Character.isLowerCase(arr[i]))
                    System.out.print(Character.toUpperCase(arr[i]));
                if (Character.isUpperCase(arr[i]))
                    System.out.print(Character.toLowerCase(arr[i]));
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nArrayOutOfIndexException");
        }
    }
}
