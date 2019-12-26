import java.util.*;
class Major{
     void ArrayNumber()
     {
        Scanner s=new Scanner(System.in);
        int b=s.nextInt();
        int[] a=new int[b];
        for(int i=0;i<b;i++){
            a[i]=s.nextInt();
        }
        int n=s.nextInt();
        int i,f=0;
        for(i=0;i<b;i++){
            if(n==a[i])
            {
                    a[i]=0;
                    f=1;
            }
            else{
                int m;
                while(a[i]>0){
                      m=a[i]%10;
                        a[i]/=10;
                      if(m==n||a[i]==n){
                        
                        a[i]=0;
                        f=1;
                      }
                      }
                    }
        }
        if(f==0)
                 System.out.println("no");
        else
                 System.out.println("yes");

     }
     void ArrayArithmetic()
     {
                int i;
                Scanner s=new Scanner(System.in);
                int n= s.nextInt();
                int[] a= new int[n];
                for(i=0;i<n;i++)
                {
                    a[i]=s.nextInt();
                }
                for(i=0;i<n-1;i++){
                    System.out.println("add" +(a[i]+a[i+1])+"\t"+"sub" + (a[i]-a[i+1])+"\t"+"multiply" + a[i]*a[i+1]+"\t"+"div" + a[i]/a[i+1] +"\t"+"modulo" + a[i]%a[i+1]);
                }
            }
     public static void main(String[] args) {
         Major m= new Major();
        //  m.ArrayNumber();
         m.ArrayArithmetic();
     }
}