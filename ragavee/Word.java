import java.io.*;
import java.util.*;
import java.lang.*;
class Word{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        String s1=obj.nextLine();
        int z=0,o=0;
        // char[] ch=new char[s1.length()];
        // ch=s1.toCharArray();
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='z')
            z++;
            else
            o++;
        }
        if((2*z)==o)
        System.out.println("Yes");
        else 
        System.out.println("No");
    }
}
