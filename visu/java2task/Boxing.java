public class Boxing
{
    public static void main(String[] args) {
        int i=10;
        Integer j=new Integer(5);
        //Boxing
        Integer a=Integer.valueOf(i);//explicitly converted
        System.out.println(""+a);
        Integer b=i;
        System.out.println(""+b);//Internal conversion
        //unboxing
        int c=j.intValue();//explicitly converted
        System.out.println(""+c);
        int d=j;//Internal conversion
        System.out.println(""+d);
        j++;
        System.out.println(""+j);

    }
}