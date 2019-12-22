import java.lang.*;
class Prime{
    public static void main(String[] args) {
        int n,i;
        n=Integer.MAX_VALUE;
        for(i=2;i<n;i++)
        {
            if(fun(i)==0)
            {
                System.out.print(i+"\t");
            }
        }
    }

        static int fun(int a){
            for(int i=2;i<a;i++)
            {
                if(a%i==0)
                {
                    return 1;
                    // break;
                }
            }
            return 0;
        }
    }