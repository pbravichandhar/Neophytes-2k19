import java.lang.*;
import java.util.*;

class CommandLineDemo{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        if(args.length>0){
            for(String var:args){
                System.out.println(var);
            }
        }
        else
           System.out.println("no args");
    }
}