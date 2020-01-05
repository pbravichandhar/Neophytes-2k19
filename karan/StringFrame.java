import java.util.*;

class StringFrame{
    public static void main(String[] args) {
        int i,j,cl=0,rl=0;
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        String a[]=s.split("\\s");
        rl=a.length;
        for(i=0;i<rl;i++){
            if(a[i].length()>cl){
                cl=a[i].length();
            }
        }
        cl+=4;
        rl+=2;
        for(i=0;i<rl;i++){
            System.out.println();
            for(j=0;j<cl;j++){
                if((i==0)||(i==rl-1)){
                    System.out.print("*");
                }
                else{
                    if(j==0){
                        System.out.print("*");
                    }
                    else{
                        if(i!=0 && i!=rl-1)
                        {
                            if(j==1){
                                System.out.print(" "+a[i-1]);
                            }
                            if(j==cl-1){
                                int k=a[i-1].length()+2;
                                int m=cl-k;
                                for(int km=0;km<m-1;km++){
                                    System.out.print(" ");
                                }
                                System.out.print("*");
                            }
                        }
                    }
                }
            }
        }
    }
}
