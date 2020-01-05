//program to implement short circuit logical operator
public class Shortlog {
    public static void main(String args[]) {
        int a = 3, b = 5, c = 0;
        if (a != 0 || b++ > 0) {
            System.out.println("(a != 0 || b++ > 0) is true and value of b is : " + b);
        } else {
            System.out.println("(a != 0 || b++ > 0) is false");
        }

        System.out.println();
        if (a != 0 | b++ > 0) {
            System.out.println("(a != 0 | b++ > 0) is true and value of b is : " + b);
        } else {
            System.out.println("(a != 0 | b++ > 0) is false");
        }
        System.out.println();
        if (a != 3 && (a / c) > 5) {
            System.out.println("(a != 3 && (a / c) > 5) is true");
        } else {
            System.out.println("(a != 3 && (a / c) > 5) is false");
        }
        System.out.println();
        if (a != 3 & (a / c) > 5) {
            System.out.println("(a != 3 & (a / c) > 5) is true");
        } else {
            System.out.println("(a != 3 & (a / c) > 5) is false");
        }
    }
}
