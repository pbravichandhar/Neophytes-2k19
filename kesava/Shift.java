import java.util.Scanner;


public class shift {

    public static void main(String[]args)
    {


       char [] arr={'b','c','d','E','f','g','h','I','j','k','l','m','n','O','p','q','r','s','t','U','v','x','y','z','A'};
        Scanner inp=new Scanner(System.in);
        String a=inp.nextLine();

        StringBuilder res= new StringBuilder();

        //Control statement to shift the character
        for(int i=0;i<a.length();i++)
        {
            // checks the non alphabetical charcters

            res.append((a.charAt(i) >= 97 && a.charAt(i) <= 122) ? arr[a.charAt(i) - 97] : a.charAt(i));
        }
         System.out.println(res);
        }

    }



