import java.util.*;
class Anime
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the total animal types:");
        int[] arr=new int[3];
        for(int i=0;i<num;i++){
            arr[i]=s.nextInt();
        }
        animals(arr);
    }
    public static void animals(int[] array)
{
    int n=(2*array[0]+4*array[1]+4*array[2]);
    System.out.println(n);
}
}