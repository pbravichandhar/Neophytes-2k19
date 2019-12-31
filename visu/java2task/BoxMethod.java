//Autoboxing and boxing on methods
public class BoxMethod
{
    public static void main(String[] args) {
        Integer a=autoBox(20);
        int b=autoUnbox(5);
        System.out.println(""+a);
        System.out.println(""+b);
    }
    static Integer autoBox(int n)
    {
        return n;
    }
    static int autoUnbox(Integer n)
    {
        return n;
    }
}