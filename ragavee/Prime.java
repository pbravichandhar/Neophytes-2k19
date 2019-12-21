import java.util.*;

class Prime{
    public static void main(String args[]){
        int c=0;
        //to find prime num upto limit of integer
        for(int i=2;i<=Integer.MAX_VALUE;i++){
            c=0;
            for(int j=i;j>=1;j--){
                if(i%j==0)
                c++;
            }
            if(c==2)
            System.out.println(i);
        }
    }
}