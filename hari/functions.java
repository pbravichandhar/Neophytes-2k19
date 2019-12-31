import java.util.*;
class functions{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x=s.nextInt();
        Integer y=x;
        int num=s.nextInt();
        System.out.println("The compared value is:" + compare(y));
        Type t1=Type.function(num);
        System.out.println("The enum function : " + t1);
    }

    public enum Type
{
    left , Right ,down ,up;
    public static Type function(int value)
    {
        for(Type t : Type.values())
        {
            if(t.ordinal() == value)
            {
                return t;
            }
        }
        return null;
    } 
}
    public static int compare(Integer number)
    {
        return (number.compareTo(5));
    }
    // class getvalue implements Type{
    //     public void inherits() {
    //            System.out.println("Executed");
    //     }
    // }
}