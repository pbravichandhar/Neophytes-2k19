//use of value and valuesof
enum cricketers
{
    dhoni,sachin,raina,yuvraj,rohit
}
public class Enumfun
{
    public static void main(String[] args) {
    
        cricketers c[]=cricketers.values();//use of value()
        for(cricketers a:c)
        System.out.println(a);
        cricketers r;
        r = cricketers.valueOf("dhoni");//use of valueof()
        System.out.println("I AM " + r);
        cricketers a=cricketers.dhoni;
        cricketers b=cricketers.valueOf("dhoni");
        System.out.println(a==b);
        System.out.println(a.equals( b ));//use of equals()
    }
}