import java.util.*;
class Frame1{
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        String s=p.nextLine();
        System.out.println(s);
        int i=0,j=0;
        String[] s1=s.split(" ");
        int length1 = 0; 
        int length2=0; 
        length2=s1.length;//length2="row",total numberof words
        for(i=0;i<length2;i++){
            if(length1 < s1[i].length()){ 
              length1 = s1[i].length(); //length1="column",longestword
              }
      }   
        // System.out .println(length1);
        length1+=4;
        length2+=2;
        for(i=0;i<length2;i++)
        {
            System.out.println();
            for(j=0;j<length1;j++){
                if((i==0)||(i==(length2-1)))
                    System.out.print("*");
                else{
                    if(j==0){
                        System.out.print("*");
                    }
                    else{
                        if(i!=0 && i!=length2-1){
                            if(j==1){
                                System.out.print(" ");
                            }
                            if(j==2){
                                System.out.print(s1[i-1]);
                            }
                            if(j==length1-1){
                                int k=s1[i-1].length()+2;
                                int m=length1-k;
                                for(int l=0;l<m-1;l++){
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