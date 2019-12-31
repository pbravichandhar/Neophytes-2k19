import java.util.*;
class Farm{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter number of chickens");
        int a=s.nextInt();
        System.out.println("enter number of Cows");
        int b=s.nextInt();
        System.out.println("enter number of Pigs");
        int c=s.nextInt();

        int n=animals(a,b,c);
        System.out.println(n);
        
    }
    static int animals(int a, int b, int c){
        int result=(a*2)+(b*4)+(c*4);;
        
        return result;
    }

}