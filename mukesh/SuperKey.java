class Parant {
    int i = 100;

    public void printt() {
        System.out.print("In parant class");
    }
}

class Child extends Parant {
    int i = 1000;

    void print() {
        System.out.println(i);
        System.out.println(super.i);
        super.printt();
    }
}

public class SuperKey {
    public static void main(String args[]) {

        Child obj = new Child();
        obj.print();
    }
}
