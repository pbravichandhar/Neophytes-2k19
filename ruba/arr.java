import java.util.*;
public class arr
{
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
            int num=s.nextInt();
            int[] arr=new int[num];
            int[] sum=new int[num];
            int[] sub=new int[num];
            int[] mul=new int[num];
            int[] divq=new int[num];
            int[] divr=new int[num];
            for(int i=0;i<num;i++)
                {
                    arr[i]=s.nextInt();
                }    
            for(int i=0;i<num;i++)
                {   
                    if(i!=num-1)
                    {
                        sum[i]=arr[i]+arr[i+1];
                        sub[i]=arr[i]-arr[i+1];
                        mul[i]=arr[i]*arr[i+1];
                        divq[i]=arr[i]/arr[i+1];
                        divr[i]=arr[i]%arr[i+1];
                    }
                }
            for(int j=0;j<num-1;j++)
            {
                    System.out.println("sum "+sum[j]+" sub "+sub[j]+" mul "+mul[j]+" divq "+divq[j]+" divr "+divr[j]);
                   

            }
    }
}