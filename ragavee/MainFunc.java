import java.util.*;

class Function{
    public void add(int arr[]){
        System.out.println("---Add---");
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]+arr[i+1]);
        }
    }
    public void sub(int arr[]){
         System.out.println("---subract---");
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]-arr[i+1]);
            }
    }
    public void mul(int arr[]){
        System.out.println("---multiply---");
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]*arr[i+1]);
        }
    }
    public void div(int arr[]){
        System.out.println("---divide---");
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]/arr[i+1]);
        }       
    }
    public void mod(int arr[]){ 
        System.out.println("---modulo---");
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]%arr[i+1]);
        }      
    }
} 
class MainFunc{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        arr[i]=obj.nextInt();
        Function obj1=new Function();
        System.out.println("select function: 1.add\n2.sub\n3.mul\n4.div\n5.modulo");
        int select=obj.nextInt();
        switch (select){
            case 1:
                obj1.add(arr);
                break;
            case 2:
                obj1.sub(arr);
                break;
            case 3:
               obj1.mul(arr);
               break;
            case 4:
                obj1.div(arr);
                break;
            case 5:
                obj1.mod(arr);
                break;
        }
    }
}