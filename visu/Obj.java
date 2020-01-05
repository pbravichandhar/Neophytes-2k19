
class Obj1 {
    int a, b;

    Obj1(int i, int j) {
        a = i;
        b = j;
    }

    boolean equalTo(Obj1 o) {
        return (o.a == a && o.b == b);
    }
}

class obj {
    public static void main(String args[]) {
        Obj1 ob1 = new Obj1(100, 22);
        Obj1 ob2 = new Obj1(100, 22);
        Obj1 ob3 = new Obj1(-1, -1);

        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
    }
}