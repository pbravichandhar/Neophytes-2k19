import java.util.*;

class Frames{
    public static void main(String[] args) {
        int ci,i=0,j,n,col=0,row=0;
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=s.length();
        String ar[]=s.split("\\s");
        row=ar.length;
        for(i=0;i<row;i++){
            if(ar[i].length()>col){
                col=ar[i].length();
            }
        }
        col+=4;
        row+=2;
        for(i=0;i<row;i++){
            System.out.println();
            for(j=0;j<col;j++){
                if((i==0)||(i==row-1)){
                    System.out.print("*");
                }
                else{
                    if(j==0){
                        System.out.print("*");
                    }
                    else{
                        if(i!=0 && i!=row-1)
                        {
                            if(j==1){
                                System.out.print(" ");
                            }
                            if(j==col-1){
                                int k=ar[i-1].length()+2;
                                int m=col-k;
                                for(int km=0;km<m-1;km++){
                                    System.out.print(" ");
                                }
                                System.out.print("*");
                            }
                            if(j==2){
                                System.out.print(ar[i-1]);
                            }
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}

