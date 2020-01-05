import java.util.*;

class Tables{
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            System.out.print("Tables "+i+" : ");
            for(j=1;j<=n;j++){
                System.out.print(" \t "+j+" * "+i+" = "+(i*j));
            }
            System.out.println();
        }
    }
}
