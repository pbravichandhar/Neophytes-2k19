import java.util.Scanner;
public class WaterBallon{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=scan.nextInt();
        int arr[]=new int[size];
        int mid=(size/2);
        System.out.println("Mid value "+mid);
        int i=0,j=0;
        for(i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        /*if(arr[mid]==0){
            for(i=0;i<size;i++){
                arr[i]=0;
                System.out.println(arr[i]);
            }
        }*/
        for(i=0;i<mid;i++){
                arr[i]=i;
                System.out.print(arr[i]+" ");
        }
        System.out.print(arr[mid]+" ");
        for(j=mid+1;j<size;j--){
            arr[j]=i;
            i--;
            System.out.print(arr[i]+" ");
        }
}
}
//end



