import java.util.Scanner;

class WaterBalloon{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter size of array(odd size only)");
        int size=obj.nextInt();
        int[] prepop=new int[size];
        int midindex=prepop.length/2;
        int j=1;
        //to get only the middle non-zero element and set remaining to zero
        for(int i=0;i<prepop.length;i++){
            if(i==midindex){
                System.out.println("enter a non-zero number");
                prepop[i]=obj.nextInt();
            }
            else{
                prepop[i]=0;
            }
        }
        if(midindex==prepop[midindex]){
            for(int i=0;i<=midindex;i++){
                prepop[i]=i;
            }
            for(int i=midindex+1;i<prepop.length;i++){
                prepop[i]=prepop[midindex-j];
                j++;
            }
        }
        System.out.println("---popped state---");
        for(int i:prepop){
            System.out.print(i);
        }
    }
}