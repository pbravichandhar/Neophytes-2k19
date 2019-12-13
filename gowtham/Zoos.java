import java.util.Scanner;

class Zoos{
    public static void main(String[] args) {
        int i,j=0,c=0;
        Scanner l=new Scanner(System.in);
        String s=l.nextLine();
        char[] a= new char[20];
        a=s.toCharArray();
        for(i=0;i<s.length();i++){
            if(a[i]=='z')
            {
                c++;
            }
            if(a[i]=='o')
            {
                j++;
            }
        }
            c=c*2;
            if(j==c)
                System.out.println("yes");
            else
            System.out.println("no");


    }
}
