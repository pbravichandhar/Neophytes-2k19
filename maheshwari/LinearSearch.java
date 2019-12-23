import java.util.Scanner;
public class LinearSearch{
    public static void main(String args[]){
        int array[]={10,20,7,2,30,94,99,25,1969,29};
        int search_element,i,flag=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Element you want to search.");
        search_element=scan.nextInt();
        for(i=0;i<array.length;i++){
            if(array[i]==search_element){
                System.out.println("The search element found at "+i+" position.");
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("The search element not found in that array");
        }
    }
}