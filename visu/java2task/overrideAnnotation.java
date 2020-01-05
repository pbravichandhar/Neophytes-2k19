public class overrideAnnotation {
{

    public void Display() {
        System.out.println("Base display()");
    }

    public static void main(String args[]) {
        overrideAnnotation t1 = new Derived();
        t1.Display();
    }
}

class Derived extends overrideAnnotation {
    @Override
    public void Display() {
        System.out.println("Derived display()");
    }
}
