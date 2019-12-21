//method overriding using static
class A {
    static void show() {
        System.out.println("overriding method");
    }

    void run() {
        System.out.println("cant be overridden");
    }
}

class B extends A {
    static void show() {
        System.out.println("overriding method");
    }

    public void run() {
        System.out.println("cantoverridden");
    }
}

public class Methstatic {
    public static void main(String args[]) {
        A a = new B();
        A.show();
        a.run();
    }
}