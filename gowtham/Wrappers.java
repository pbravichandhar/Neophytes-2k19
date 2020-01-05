import java.lang.*;

class Wrappers {
    static void m(int i) {
        System.out.println("int");
    }

    static void m(Integer i) {
        System.out.println("Integer");
    }

    public static void main(String[] args) {
        Wrappers w =new Wrappers();
        String s1="35151";
        int h=0;
        Integer i=Integer.parseInt(s1);
        System.out.println(i);
        i++;
        System.out.println(i);
        i=i/2;
        System.out.println(i);
        h=h+(i/2);
        System.out.println(h);
        System.out.println(Integer.valueOf(s1));
        System.out.println(w instanceof Wrappers);
        m(Integer.parseInt(s1));
        m(Integer.valueOf(s1));

        Boolean booleanObject = true;
         if (booleanObject){
         System.out.println("b is true");
        }
    
        Character ch = 'x'; // box a char
        char ch2 = ch; // unbox a char
         System.out.println("ch2 is " + ch2);
    }
}

