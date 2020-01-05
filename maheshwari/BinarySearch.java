import java.util.Scanner;
public class BinarySearch{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n,i,j,mid,last,first=0,search_element;
        System.out.println("Enter the size of the array");
        n=scan.nextInt();
        int array[]=new int[n];
        for(i=0;i<n;i++){
            array[i]=scan.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(array[i]>array[j]){
                    array[i]=array[i]+array[j];
                    array[j]=array[i]-array[j];
                    array[i]=array[i]-array[j];
                }
        
            }
           // System.out.println(array[i]);
        }
       last=array.length-1;
       mid=(first+last)/2;
       System.out.println("Enter the element to search");
       search_element=scan.nextInt();
       while(first<=last){
           if(array[mid]==search_element){
               System.out.println("The element found at Index: "+mid);
               break;
           }
           else if(array[mid]<search_element){
               first=mid+1;
           }
           else if(array[mid]>search_element){
               last=mid-1;
           }
           mid=(first+last)/2;
       }
      if(first>last){
           System.out.println("Element not found");
       }

    }
}