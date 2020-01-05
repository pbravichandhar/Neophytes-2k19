import java.util.*;
class Farm {
    public static void main(String args[]) {
        int h, c, p, t;
        Scanner inp = new Scanner(System.in);
        System.out.println("Numper of chickens :");
        h = inp.nextInt();
        System.out.println("Numper of cows:");
        c = inp.nextInt();
        System.out.println("Numper of pigs:");
        p = inp.nextInt();
        System.out.println("Total number of legs is:");
        t = (2 * h) + (4 * c) + (4 * p);
        System.out.println(t);
    }
}