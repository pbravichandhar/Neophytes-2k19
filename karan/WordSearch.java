import java.io.*;
import java.util.*;
import java.math.*;

public class WordSearch {

    public static void main(String[] args) {
        
        int inc1,inc2,numberofrows,numberofcols,index0=0,index1=0;
        String getarray;
        // char wordarray[]=new char[50];
        char array[][]=new char[10][10];
        Scanner sc=new Scanner(System.in);
        numberofrows=sc.nextInt();
        numberofcols=sc.nextInt();
        String strin;
        for(inc1=0;inc1<numberofrows;inc1++) {
            if(sc.hasNext()) {
                strin=sc.next();
            }
            else {
                break;
            }
            for(inc2=0;inc2<numberofcols;inc2++) {
                array[inc1][inc2]=strin.charAt(inc2);
            }
        }
        // for(inc1=0;inc1<numberofrows;inc1++) {
        //     for(inc2=0;inc2<numberofcols;inc2++) {
        //         System.out.print(array[inc1][inc2]+" ");
        //     }
        //     System.out.println();
        // }
        getarray=sc.next();
        char wordarray[]=getarray.toCharArray();
        for(char c: wordarray){
            System.out.print(c+"   ");
        }
        System.out.println();
        for(inc1=0;inc1<numberofrows-1;inc1++) {
            for(inc2=0;inc2<numberofcols-1;inc2++) {
                if(array[inc1][inc2]==wordarray[inc2]){
                    index0=inc1;
                    for(int i=0;i<getarray.length();i++) {
                        if(array[inc1][inc2+i]==wordarray[i]) {
                            System.out.print(wordarray[i]+" ");
                            continue;
                        }
                        else {
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("String "+getarray+" found in indexes : "+index0+" and "+index1);
    }
}
