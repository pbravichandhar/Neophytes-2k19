import java.util.*;
class sss
{
    public static void main(String[] args)
    {
         Scanner s=new Scanner(System.in);

        int l=0,le=0;
        String str=s.nextLine();
         String []arr=str.split("\\s");
        for(String ab: arr){
            le++;
        }
        System.out.print(le);
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=32)
            {
                System.out.print(str.charAt(i));
            }
        }
    }
}