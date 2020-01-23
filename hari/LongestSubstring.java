import java.util.Scanner;

class LongestSubstring {
    public static void main(String[] args) {
        int j = 0, i = 0, max = 0, flag = 0;
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char[] arr = str.toCharArray();
        int[] arr = new int[a.length()];
        String[] res = new String[a.length()];
        String Substring = "";
        StringBuffer resultstring = new StringBuffer();
        for (char item : arr) {
            arr[i] = Integer.parseInt(item + "");
            i++;
        }
        i = 1;
        for (; i < a.length(); i++) {
            if ((arr[i] % 2 == 1) && (arr[i - 1] % 2 == 0)) {

                if (flag != 0) {
                    resultstring.append(arr[i]);
                } else {
                    resultstring.append(arr[i - 1] + "" + arr[i]);
                }
                flag++;

            } else if ((arr[i] % 2 == 0) && (arr[i - 1] % 2 == 1)) {
                if (flag != 0) {
                    resultstring.append(arr[i]);
                } else {
                    resultstring.append(arr[i - 1] + "" + arr[i]);
                }
                flag++;
            } else {
                flag = 0;
                if (!(resultstring.toString().equals(""))) {
                    res[j] = resultstring.toString();
                    resultstring.setLength(0);
                    j++;
                }
            }
        }

        for (String item : res) {
            try {
                if (max < item.length()) {
                    max = item.length();
                    Substring = item;
                }
            } catch (NullPointerException e) {
                break;
            }
        }
        System.out.print(Substring);
    }
}