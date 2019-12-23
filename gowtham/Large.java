class Samples {
    int a, b;

    static void fun(int a, int b) { // method overloading
        System.out.println(a + b);
    }

    static void fun(int a, int b, int c) { // method overloading
        System.out.println(a + b + c);
    }

    Samples(int a, int b) { // contrutor overloading
        System.out.println("constructor" + (a + b));
        this.a = a;
        this.b = b;
    }

    Samples(int a, int b, int c) { // contrutor overloading
        System.out.println("constructor" + (a + b + c));
    }

    Samples meth() { // object as return value
        Samples t = new Samples(a + 10, b + 10);
        return t;
    }

    boolean equalTo(Samples o) // object as parameters
    {
        return (o.a == a && o.b == b);
    }

    static void Loop() // foreach loop
    {
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        for (char i : vowels) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Samples s = new Samples(5, 4); // contrutor overloading
        Samples s2 = new Samples(5, 4);// contrutor overloading

        // boolean b = ;
        // System.out.println(instasn(s));
        // System.out.println(typeOf(s);)
        System.out.println(s.equalTo(s2)); // object as parameter
        Samples s1 = new Samples(5, 4, 5); // contrutor overloading
        fun(5, 4); // method overloading
        fun(5, 4, 5); // method overloading
        Samples s3;
        s3 = s.meth(); // object as return
        System.out.println("ob1.a: " + s.a);
        System.out.println("ob2.a: " + s3.a); // object as return
        System.out.println("ob1.a: " + s.b);
        System.out.println("ob2.a: " + s3.b); // object as return
        Loop();

    }
}