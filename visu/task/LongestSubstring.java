import java.util.Scanner;

class LongestSubstring {
    public static void main(String[] args) {
        int j = 0, i = 0, max = 0, f = 0;
        Scanner s = new Scanner(System.in);
        String a = s.next();
        char[] arr = a.toCharArray();
        int[] checkarray = new int[a.length()];
        String[] res = new String[a.length()];
        String ResSubstring = "";
        StringBuffer resultstring = new StringBuffer();
        for (char item : arr) {
            checkarray[i] = Integer.parseInt(item + "");
            i++;
        }
        i = 1;
        for (; i < a.length(); i++) {
            if ((checkarray[i] % 2 == 1) && (checkarray[i - 1] % 2 == 0)) {

                if (f != 0) {
                    resultstring.append(checkarray[i]);
                } else {
                    resultstring.append(checkarray[i - 1] + "" + checkarray[i]);
                }
                f++;

            } else if ((checkarray[i] % 2 == 0) && (checkarray[i - 1] % 2 == 1)) {
                if (f != 0) {
                    resultstring.append(checkarray[i]);
                } else {
                    resultstring.append(checkarray[i - 1] + "" + checkarray[i]);
                }
                f++;
            } else {
                f = 0;
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
                    ResSubstring = item;
                }
            } catch (NullPointerException e) {
                break;
            }
        }
        System.out.print(ResSubstring);
    }
}