//StringInbuilt functions
import java.util.Scanner;
public class StringInBuilt{
    public static void main(String args[]){
        String s1="  Hello Everyone  ";
        String s2,s3;
        System.out.println("Length of the given String is "+s1.length());
        s2=s1.trim();
        System.out.println("After trimming "+s1.trim());
        System.out.println(s2.concat(" How are you"));
        System.out.println("All uppercase "+s1.toUpperCase()+"All lowercase "+s2.toLowerCase());
        System.out.println("Equal of two string "+s1.equals(s2));
        System.out.println("Checking ends with "+s2.endsWith("e"));
        System.out.println(s2.charAt(2)+" "+s2.indexOf('E'));
        System.out.println("String Empty checking "+s1.isEmpty());
        System.out.println("Replace function "+s1.replace('H','h'));
        System.out.println("ReplaceOnce function "+s1.replaceFirst("Hello","Welcome"));
        System.out.println("Contains function "+s1.contains("Welcome"));
        System.out.println("Code Point at "+s1.codePointAt(2));
        System.out.println("Code Point Count "+s1.codePointCount(2,6));
        s3=s1.intern();
        System.out.println(s3==s1);
        System.out.println(s3==s2);
        System.out.println(s2.substring(6,10));
        try{
            System.out.println(s1.getBytes("UTF-8"));
            System.out.println(s1.getBytes("ISO-8859-1"));
        }catch(Exception e){
            System.out.println(e);
        }
    }
}



