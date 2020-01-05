class Sum implements Cloneable
{
    int value1,value2;
    public Object clone()throws CloneNotSupportedException
    {
        return super.clone();
    }
    void sumofintedgers()
    {
        System.out.println(value1+value2);
    }
}
public class Cloning {
    public static void main(String []args) throws CloneNotSupportedException {
        Sum s=new Sum();
        s.value1=5;
        s.value2=6;
        s.sumofintedgers();
        Sum s2=(Sum)s.clone();
        s2.value1=10;
        s2.value2=10;
        s2.sumofintedgers();
    }
}
