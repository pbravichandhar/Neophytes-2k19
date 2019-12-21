import java.util.*;

class Func{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        arr[i]=obj.nextInt();
        add(arr);
        sub(arr);
        mul(arr);
        div(arr);
        modulo(arr);
    }
    public static void add(int[] input){
        System.out.println("---Add---");
        for(int i=0;i<input.length-1;i++){
            int addres=input[i]+input[i+1];
            System.out.println(addres);
        }
    }
    public static void sub(int[] input){
        System.out.println("---subract---");
        for(int i=0;i<input.length-1;i++){
            int addres=input[i]-input[i+1];
            System.out.println(addres);
        }
    }
    public static void mul(int[] input){
        System.out.println("---multiply---");
        for(int i=0;i<input.length-1;i++){
            int addres=input[i]*input[i+1];
            System.out.println(addres);
        }
    }
    public static void div(int[] input){
        System.out.println("---divide---");
        for(int i=0;i<input.length-1;i++){
            int addres=input[i]/input[i+1];
            System.out.println(addres);
        }
    }
    public static void modulo(int[] input){
        System.out.println("---modulo---");
        for(int i=0;i<input.length-1;i++){
            int addres=input[i]%input[i+1];
            System.out.println(addres);
        }
    }
} 