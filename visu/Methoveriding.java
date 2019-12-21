//method overriding
class Method {

    void run() {
        System.out.println("overridden method");
    }

}

class method1 extends Method {
    void run() {
        System.out.println("overriding method");
    }
}

public class Methoveriding {
    public static void main(String[] args) {
        Method m = new Method();
        m.run();
        Method n = new method1();
        n.run();

    }
}