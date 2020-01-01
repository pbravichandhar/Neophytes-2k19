import java.util.*;

class Function{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        arr[i]=obj.nextInt();
        for(int i=0;i<size-1;i++)
       {
           System.out.println("add: "+(arr[i]+arr[i+1])+"\n"+"sub: "+(arr[i]-arr[i+1])+"\n"+"mul: "+(arr[i]*arr[i+1])+"\n"+"div: "+(arr[i]/arr[i+1])+"\n"+"mod: "+(arr[i]%arr[i+1])+"\n");
       }
    }
       
} 