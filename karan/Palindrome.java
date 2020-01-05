import java.util.*;

class Palindrome{
    public static void main(String[] args) {
        int i,j,l,c=1;
        String s;
        char a[]=new char[50];
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        a=s.toCharArray();
        l=s.length();
        for(i=0;i<l/2;i++){
            for(j=(l/2)-1;j>=0;j--){
                if(a[i]==a[j]){
                    continue;
                }
                else{
                    c=0;
                    break;
                }
            }
        }
        if(c==1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
