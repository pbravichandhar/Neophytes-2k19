public class PrimeNumbers{
    public static void main(String args[]){
        int i,max=Integer.MAX_VALUE,flag=0,j;
        System.out.println("Prime numbers are");
        for(i=1;i<max;i++){
            flag=0;
            for(j=i;j>=1;j--){
                if(i%j==0){
                
                    flag++;
                }
            }
            if(flag==2){
            System.out.print(i+" ");
        }
        
        }
        }
    }
