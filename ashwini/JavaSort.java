import java.util.*;
class JavaSort
{
    public static void main(String args[])
    {
        int[] intArr={1,2,3,4,5};
        String[] strArr={"u","o","i","e","a"};
        System.out.println("Number of CommandLine Arguments: "+args.length);
        for(int i=0;i<args.length;i++)
        {
            System.out.println(String.format("args["+ i +"]: " +args[i]));
            
        }
        Arrays.sort(intArr);
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(strArr));
    }
}