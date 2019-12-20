import java.util.*;
class Zoos{
    public static void main(String[] args) {
        int i=0,j=0,c=0,l;
        Scanner sc=new Scanner(System.in);
        char a[]=new char[100];
        String s=sc.nextLine();
        a=s.toCharArray();
        l=s.length();
        for(i=0;i<l;i++){
            if(a[i]=='z'){
                j++;
            }
            if(a[i]=='o'){
                c++;
            }
        }
        if(c==(2*j)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
