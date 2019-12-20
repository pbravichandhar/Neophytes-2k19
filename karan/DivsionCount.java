import java.util.*;

class DivsionCount{
    public static void main(String[] args) {
        int l,k,r,i,j=0;
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        r=sc.nextInt();
        k=sc.nextInt();
        for(i=l;i<=r;i++){
            if((i%k)==0){
                j++;
            }
        }
        System.out.println(j);
    }
}
