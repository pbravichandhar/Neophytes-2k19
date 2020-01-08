import java.util.*;

class Railway {
    public static void main(String[] args) {
        int totarray, inc, inc1, len1;
        String strin, strin1;
        char firstlast, nextlast;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total array ");
        totarray = sc.nextInt();
        String[] arrays = new String[totarray];
        System.out.println("Enter the arrays ");
        for (inc = 0; inc < totarray; inc++) {
            arrays[inc] = sc.next();
        }
        for (inc = 0; inc < totarray; inc++) {
            for (inc1 = (inc+1); inc1 < totarray; inc1++) {
                if(arrays[inc].equals(arrays[inc1])) {
                    System.out.println("Arrays are equals.... : " + arrays[inc] + " and " + arrays[inc1] );
                    System.exit(0);
                }
            }
        }
        for (inc = 0; inc < totarray-1; inc++) {
            strin = arrays[inc];
            strin1 = arrays[inc+1];
            len1 = strin.length();
            firstlast = strin.charAt(len1-1);
            nextlast = strin1.charAt(0);            
            if (firstlast == nextlast) {
                System.out.println(strin + " and " + strin1 + " is Valid.... ");
                continue;
            }
            else {
                System.out.println("On " + strin + " and " + strin1 + " The Railway Chracter is not matching.... ");
                continue;
            }
        }
    }
}
