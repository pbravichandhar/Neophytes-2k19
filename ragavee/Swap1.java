import java.util.*;
import java.lang.*;

class Swap1{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        String s1=obj.nextLine();
        String s2=obj.nextLine();
        int c=0;
        if(s1.length()==s2.length()){
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i))
                c++;
            }
        }
        if(c==2)
            System.out.println("true");
        else
            System.out.println("False");
    }
}