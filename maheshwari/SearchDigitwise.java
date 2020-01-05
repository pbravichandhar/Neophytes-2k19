import java.util.Scanner;
class Search{
    public int search(int elem,int arr[]){
        int i,temp;
        for(i=0;i<arr.length;i++){
            if(elem==arr[i]){
                output();
            }
            else{
                temp=arr[i];
                while(arr[i]>0){
                    temp=temp/10;
                    if(temp==elem){
                        output();
                    }
                    temp=arr[i]%10;
                    if(temp==elem){
                        output();
                        break;
                    }
                }
            }
        }
        return 0;
    }
    public void output()
    {
       System.out.println("Element found"); 
    }

}
public class SearchDigitwise{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int elem=scan.nextInt();
        int arr[]={12,3,45,65};
        Search s=new Search();
        s.search(elem,arr);

    }
}