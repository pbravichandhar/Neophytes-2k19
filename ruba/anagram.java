import java.util.*;
import java.lang.*;
class anagram {
    public static void main(Strilng args[] ) {
       
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

    
        String str=sc.next();
        String str1=sc.next();
        String str2="";

        int c=0,ana=0,len=0;
    
        
        str2=str.concat(str1);
        len=str2.length();
        //System.out.println(str2);
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            if(str2.charAt(i)==str2.charAt(j))
            {
                
                c++;
            }
        }
        //System.out.println(c+" "+len);
        ana=len-(c*2);
        System.out.println(ana);
    }
}
