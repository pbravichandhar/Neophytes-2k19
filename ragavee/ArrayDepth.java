import java.util.*;

class ArrayDepth{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        String s1=obj.next();
        int depth=0,maxdepth=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='[')
                depth+=1;
            else if(s1.charAt(i)==']')
                depth-=1;
            if(depth>maxdepth)
                maxdepth=depth;
        } 
        System.out.println(maxdepth);
    }
}