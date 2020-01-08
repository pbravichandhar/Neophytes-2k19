import java.io.*;
import java.util.*;

class WaterBaloon {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int midarray,inc,arraysize,iteration=1;
        System.out.println("Enter The Mid element : ");
        midarray=sc.nextInt();
        arraysize=(midarray*2)+1;
        int pre_pop[]=new int[arraysize];
        if(arraysize%2!=0){
            for(inc=0;inc<arraysize;inc++) {
                if(inc!=midarray) {
                    pre_pop[inc]=0;
                }
                else {
                    pre_pop[inc]=midarray;
                }
            }
            for(inc=0;inc<arraysize;inc++) {
                System.out.print(pre_pop[inc] + " ");
            }
            for(inc=0;inc<arraysize;inc++) {
                if(inc<midarray) {
                    pre_pop[inc]=inc;
                }
                if(inc>midarray&&inc!=arraysize-1) {
                    pre_pop[inc]=pre_pop[midarray-iteration];
                    iteration++;
                }
            }
            System.out.println();
            for(inc=0;inc<arraysize;inc++) {
                System.out.print(pre_pop[inc] + " ");
            }
        }
        else {
            System.out.println("Size Should be odd");
        }
    }
}
