import java.lang.String;
import java.util.Scanner;

class Swap {
    static boolean validateString(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();
        if (l1 != l2)
            return false;
        int prev = -1, curr = -1;
        int count = 0;
        for (int i = 0; i < l1; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                count++;
                if (count > 2)
                    return false;
                prev = curr;
                curr = i;
            }
        }
        return (count == 2 && str1.charAt(prev) == str2.charAt(curr) && str1.charAt(curr) == str2.charAt(prev));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if (validateString(str1, str2))
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}