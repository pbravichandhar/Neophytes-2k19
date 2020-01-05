
//java program to find depth of an array
import java.util.Scanner;;

public class ArrayDepth {
    public static void ArrayDepth(String str1) {
        int len = str1.length();
        int depth = 0, max = 0;
        for (int i = 0; i < len; i++) {
            if (str1.charAt(i) == '[') {
                depth += 1;
            } else if (str1.charAt(i) == ']') {
                depth -= 1;
            }
            if (depth > max) {
                max = depth; // Maximum depth of Array
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayDepth(str);
    }

}