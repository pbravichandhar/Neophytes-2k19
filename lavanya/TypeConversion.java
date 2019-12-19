import java.util.*;
class TypeConversion {
    public static void main(String args[]) {
        System.out.println("enter integer:");
        int i = 0;
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        char c = (char) n;
        System.out.println(c);
    }
}
