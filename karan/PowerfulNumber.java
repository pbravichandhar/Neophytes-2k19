import java.util.*;

class PowerfulNumber {

    public static boolean isprime(int primevalue) {
        
        int inc2;
        for (inc2 = 2; inc2 < primevalue; inc2++) {  
            if (primevalue % inc2 == 0) {  
                return false;  
            }  
        }
        return true;
    }

    public static boolean isPrimeFactor(int powervalue) {
        
        int inc1, check=1;
        for (inc1 = 2; inc1 < powervalue; inc1++) {
            if (powervalue % inc1 == 0) {
                if (isprime(inc1)) {
                    check = inc1 *inc1;
                    if (powervalue % check == 0) {
                        System.out.println(inc1);
                        check = 0;
                    }
                }
                if (check == 0) {
                    return true;
                }
                else {
                    continue;
                }
            }
            if (check == 0) {
                return true;
            }
            else {
                continue;
            }
        }
        
        if (check == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        
        int powernumber, inc;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number to find whether it is powerful number or not : ");
        powernumber = sc.nextInt();

        if (powernumber == 1) {
            System.out.println("Yes");
        }
        else if (isPrimeFactor(powernumber)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
