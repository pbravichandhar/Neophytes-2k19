import java.util.*;

class MaximumDepthOfArray{ 

    static int MaxDepth(String S) {
    
        int currentmax = 0;
        int max = 0;
        int n = S.length();
    
        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == '[') {
                currentmax++;
                if (currentmax > max) {
                    max = currentmax;
                }
            }
            else if (S.charAt(i) == ']') {
                if (currentmax > 0) {
                    currentmax--;
                }
                else {
                    return -1;
                }
            }
        }

        if (currentmax != 0) {
            return -1;
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(MaxDepth(s));
    } 
} 
