import java.util.*;

class Farmer{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int cchicken=obj.nextInt();
        int ccow=obj.nextInt();
        int cpig=obj.nextInt();
        System.out.println(animal(cchicken,ccow,cpig));
    }
    public static int animal(int chicken,int cow,int pig){
        int legs=(chicken*2)+(cow*4)+(pig*4);
        return legs;
    }
}