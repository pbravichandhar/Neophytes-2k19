//program to implement Finalclass
class a extends Finclass {
    void fun() {
        System.out.println("hi");
    }
}

class b extends a {
    void msg() {
        System.out.println("hiiii");
    }
}

public class Finclass {
    public static void main(String args[]) {
        b A = new b();
        A.fun();
        A.msg();
    }
}