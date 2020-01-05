import java.lang.*;
import java.util.*;
import java.io.*;

class Input
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.next();
        String str2=s.next();
        int length1=str1.length();
        int length2=str2.length();
        int num1=0;
        int num2=0;
        num1=Anagram(str1,length1);
        num2=Anagram(str2,length2);
        if(length1==length2 && num1==num2)
        {
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not an Anagram");
        }
    }
        public static int Anagram(String str,int length) {  
        int num=0;
        char[] ch=str.toCharArray();
        for(int i=0;i<length;i++)
            {
                num=num+ch[i];
            }
            return num;
        }
        
}