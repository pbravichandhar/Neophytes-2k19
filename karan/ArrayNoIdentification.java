import java.util.*;

class ArrayNoIdentification{
    public static void main(String[] args) {
        int i,j,n,ntg,c=0,m=0,t;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        ntg=sc.nextInt();
        for(i=0;i<n;i++){
            if(ntg==a[i]){
                a[i]=0;
                c=1;
            }
            else{
                while(a[i]>0){
                    t=a[i];
                    m=a[i]%10;
                    a[i]/=10;
                    if(m==ntg||a[i]==ntg){
                        a[i]=0;
                        c=1;
                    }   
                }
            }
        }
        if(c==0)
            System.out.println("no");
        else
            System.out.println("yes");
    }
}
