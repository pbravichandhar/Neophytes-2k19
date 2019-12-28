import java.util.Arrays;
import java.util.Scanner;

public class ValidateSwap {
    public static void main(String[]args)
    {
        String check,comapre;
        char[] checkarr,comparearr;
        int flag=0;
        Scanner s=new Scanner(System.in);
        check=s.next().toLowerCase();
        comapre=s.next().toLowerCase();
        checkarr=check.toCharArray();
        comparearr=comapre.toCharArray();
        Arrays.sort(checkarr);
        Arrays.sort(comparearr);
        if (Arrays.equals(checkarr, comparearr))
        {
            for(int i=0;i<comapre.length();i++)
            {
                if(check.charAt(i)!=comapre.charAt(i))
                {
                    flag+=1;
                }
            }
        }
        if(flag==2)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
}
