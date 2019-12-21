import java.io.*;
import java.util.*;
import java.lang.*;

class Anagram{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        String s1=obj.next();
        String s2=obj.next();
        s1=s1.concat(s2);
        int size=s1.length();
        int c=0;
        for(int i=0;i<s1.length();i++){
            for(int j=i+1;j<s1.length();j++){
                if(s1.charAt(i)==s1.charAt(j)) {//to scan each element in the string
                    c++;    
                    break; //breaks when it is checked to ignore unwanted iterations
                }
            }
        }
        //System.out.println(c);
        size=size-(c*2);
        System.out.println(size);
    }
}