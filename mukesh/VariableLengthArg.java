public class VariableLengthArg {
    static void fun(int... a) {
        System.out.println("Length of input : " + a.length);
        for (int num : a) {
            System.out.println(num + " ");
        }
        if (a.length == 0) {
            System.out.println("No input");
        }

    }

    static void fun(float... a) {
        System.out.println("Length of input : " + a.length);
        for (float num : a) {
            System.out.println(num + " ");
        }
        if (a.length == 0) {
            System.out.println("No input");
        }

    }

    public static void main(String[] args) {
        // fun(); when we use overloading it will give error because it do not know what
        // to call
        fun(2);
        fun(20, 40, 50);
        fun(0.5f, 0.9f, 0.1f);

    }
}
