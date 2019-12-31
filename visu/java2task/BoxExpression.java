//autoboxing and boxing occur in expressio
public class BoxExpression {
    public static void main(String[] args) {
        Integer a, b, c;
        a = 10;
        b = 5;
        System.out.println("" + a + "" + b);
        ++a;
        b++;
        System.out.println("" + a + "" + b);
        c = a + (b / 3);
        System.out.println(c);
        c = a * b + c;
        System.out.println(c);

    }
}