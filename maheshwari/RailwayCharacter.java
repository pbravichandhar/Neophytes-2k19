//Railway Character 
import java.util.Scanner;
public class RailwayCharacter{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int i=0,j=0,index=0,flag1=0,flag2=0;
        char first=' ',last=' ';
        System.out.println("Enter the size of the string array");
        int size=scan.nextInt();
        String[] input= new String[size];
        for(i=0;i<size;i++){
            input[i]=scan.next();
        }
        for(i=0;i<size;i++){
            for(j=0;j<size;j++){
                if(input[i].equals(input[j])){
                    flag1=1;
                }
            }
        }
        for(i=0;i<size-1;i++){
                index=input[i].length();
                last=input[i].charAt(index-1);
                first=input[i+1].charAt(0);
                if(first==last){
                    flag2++;
                }
        }
        if(flag2>0){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}

