import java.util.Scanner;
public class Pattern{
    public static void main(String args[]){
        int i,j,max=0,k=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string");
        String sentence=scan.nextLine();
        String[] word=sentence.split("\\s");
        for(i=0;i<word.length;i++){
            if(max < word[i].length()){
                max=word[i].length();
            }

        }
        System.out.println(max);
        for(i=0;i<max+2;i++){ 
            for(j=0;j<max+2;j++){
                if(i==0||i==max+1||j==0||j==max+1)
                    System.out.print("*");

                else{
                System.out.print(sentence.charAt(k));
                k++;
                }
            }
            System.out.println();
        }
    }
}