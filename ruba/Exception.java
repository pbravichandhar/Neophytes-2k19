import java.util.*;
class Exception
{
    public static void main(String[] args)
    {
        int a=0,b=10;
        int[] arr=new int[2];
        try
        {
            //System.out.println(b/a);
            int i=arr[5];
            
        }
        catch(ArithmeticException e)
        {
            System.out.print("divide by zero error");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.print("array index out of bound");
        }
    }
}