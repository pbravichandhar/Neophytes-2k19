import java.util.*;

class DepthOfArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String string = s.nextLine();
        char[] array = string.toCharArray();
        int depth = 0, max = 0;
        for (char c : array) {
            if (c == '[') {
                depth++;
            } else if (c == ']') {
                depth--;
            }
            if (depth > max) {
                max = depth;
            }
        }
        System.out.println(max);
    }
}
