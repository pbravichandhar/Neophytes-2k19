public class Nummethod {

    public static void main(String[] args) {
        int x = 5;
        Integer a = x;
        double d = 10.234;
        double b = -11.784;
        // use of compareTo()
        System.out.println(a.compareTo(5));// 0
        System.out.println(a.compareTo(6));// -1
        System.out.println(a.compareTo(4));// 1
        // use of equals()
        System.out.println(a.equals(5));// true
        System.out.println(a.equals(6));// false
        System.out.println(a.equals(4));// false
        // use of abs()
        System.out.println(Math.abs(d));// 10.234
        System.out.println(Math.abs(b));// 10.784
        // use of round()
        System.out.println(Math.round(d));// 10
        System.out.println(Math.round(b));// -11
        // use of random()
        System.out.println(Math.random());
        // use of min()
        System.out.println(Math.min(d, b));
        // use of max()
        System.out.println(Math.max(d, b));
        // use of toString()
        System.out.println(a.toString());
        // use of ceil()
        System.out.println(Math.ceil(d));
        // use of floor()
        System.out.println(Math.floor(d));

    }

}