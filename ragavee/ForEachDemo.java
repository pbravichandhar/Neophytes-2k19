import java.util.*;

class ForEachDemo{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
}