//Strin swap
import java.util.Scanner;
public class StringSwap{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int totalarray,lengthofsinglearray,count=0;
        String checkarray;
        String array[] = new String[10];
        System.out.println("Enter the number of arrays : ");
        totalarray=scan.nextInt();
        System.out.println("Enter the array elements");
        for(int i=0;i<totalarray;i++){
            array[i]=scan.next();
        }
        System.out.println("Enter the string to validate");
        checkarray=scan.next();
        for(int i=0;i<totalarray;i++){
            if(array[i].length()!=checkarray.length()){
                System.out.println("false");
                break;
            }
            for(int j=0;j<totalarray;j++){
                if(array[i].charAt(j)!=checkarray.charAt(j)){
                    count++;
                }
            }
            if(count>2){
                System.out.println("false");
            }
            else{
                System.out.println("true");
            }
            count=0;
        }
    }
}

//end
