import java.lang.*;
import java.util.*;

class CommandLine{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        String s1=obj.next();
        String[] word=s1.split("\\s");
        if(word.length==args.length){
            for(int i=0;i<word.length;i++){
                if(word[i]==args[i])
                System.out.println("Strings are same");
                else
                System.out.println("Strings are not same");
            }
        }
        else 
        System.out.println("invalid");
        // if(args.length>0){
        //     for(String var:args){
        //         System.out.println(var);
        //     }
        // }
        // else
        // System.out.println("no args");
    }
}