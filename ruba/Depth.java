import java.util.*;

public class Depth {
    public static void arraydepth(String str) {
        int len = str.length();
        int d = 0, m = 0;
        for (int i = 0; i < len; i++) 
        {
            if (str.charAt(i) == '[')
            {
                d++;
            }
             else if (str.charAt(i) == ']') 
            {
                d--;
            }
            if (d > m) {
                m = d;
            }
        }
        System.out.println(m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        arraydepth(str);
    }

}
