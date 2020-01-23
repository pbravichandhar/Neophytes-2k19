import java.util.*;

class CharacterMapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        // String str1="";
        int[] d = new int[40];
        int k = 0;
        d[0] = k;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    int g = str.indexOf(str.charAt(j));
                    d[i] = d[g];
                } else if (str.charAt(i) != str.charAt(j) && (i - 1 == j)) {

                    d[i] = ++k;
                }
                // str1 = str1 + str.charAt(i);
            }
        }
        for (int i = 0; i < len; i++)
            System.out.println(d[i]);
    }
}