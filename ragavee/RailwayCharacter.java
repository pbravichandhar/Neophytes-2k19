import java.util.Scanner;

class RailwayCharacter{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int len,last1,first2,count1 = 0,count2 = 0;
        String[] arr = new String[size];
        for(int i = 0;i<size;i++){
            arr[i] = obj.next();
        }
        //to check the last and first char
        for(int i = 0;i<arr.length-1;i++){
            len = arr[i].length();
            last1 = arr[i].charAt(len-1);
            first2 = arr[i+1].charAt(0);
            if(last1 == first2)
                count1++;
            else 
                break;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j])
                count2++;
            }
        }
        if(count1 == arr.length-1 && count2 == 0)  //to check whether all the words match
            System.out.println("Valid");    
        else 
            System.out.println("Invalid");
    }
}