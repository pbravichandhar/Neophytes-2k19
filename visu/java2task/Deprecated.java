import java.lang.annotation.Annotation;

public class Deprecated {
    @Deprecated
    public void Display() {
        System.out.println("Deprecatedtest display()");
    }

    public static void main(String args[]) {
        Deprecated d1 = new Deprecated();
        d1.Display();
    }
}
