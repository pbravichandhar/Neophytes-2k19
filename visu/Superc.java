//implement super in constructor 
class A {
    A() {
        System.out.println("Base class Constructor");
    }
}

class B extends A {
    B() {
        // invoke or call parent class constructor
        super();
        System.out.println("Student class Constructor");
    }
}

class Superc {
    public static void main(String[] args) {
        B s = new B();
    }
}
