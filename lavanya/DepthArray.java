import java.util.*;

class DepthArray {
    static int maxDepth(String S) {
        int depth = 0;
        int max = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '[') {
                depth++;
                if (depth > max) {
                    max = depth;
                }
            } else if (S.charAt(i) == ']') {
                if (depth > 0) {
                    depth--;
                } else {
                    return -1;
                }
            }
        }
        if (depth != 0) {
            return -1;
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        System.out.println(maxDepth(s));
    }
}
