import java.lang.StringBuffer;

class TypeCC{
    public static void main(String[] args) {
        int a;
        a=10;
        float b;
        b=(float)a;                                         //type conversion 
        System.out.println(b);
        StringBuffer str=new StringBuffer("Kaiser");
        String s=str.toString();                            //type casting
        System.out.println(s);
    }
}
