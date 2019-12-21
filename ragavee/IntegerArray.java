import java.util.*;

class IntegerArray{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        int searchnum=obj.nextInt();
        for(int i=0;i<arr.length;i++){
            if(searchnum==arr[i])    //if the complete element is present
            System.out.println("Yes");
            else if(searchnum==(arr[i]%10))    //if the element is present in ones place
            System.out.println("Yes");
            else if(searchnum==(arr[i]/10))    //if the element is present in tens place
            System.out.println("Yes");
            else if(searchnum==(arr[i]/100))   //if the element is present in hundreds place
            System.out.println("Yes");
        }
    }
}