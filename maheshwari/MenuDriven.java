import java.util.Scanner;
class Operations{
    int i,result;
    public void addition(int array[],int size){
        for(i=0;i<size-1;i++){
                        result=array[i]+array[i+1];
                        System.out.println(array[i]+" + "+array[i+1]+" = "+result);
                    }
    }
    public void subtraction(int array[],int size){
        for(i=0;i<size-1;i++){
                        result=array[i]-array[i+1];
                        System.out.println(array[i]+" - "+array[i+1]+" = "+result);
                    }    
    }
    public void multiplication(int array[],int size){
        for(i=0;i<size-1;i++){
                        result=array[i]*array[i+1];
                        System.out.println(array[i]+" * "+array[i+1]+" = "+result);
                    }
    }
    public void division(int array[],int size){
        for(i=0;i<size-1;i++){
                        result=array[i]/array[i+1];
                        System.out.println(array[i]+" / "+array[i+1]+" = "+result);
                    }
    }
    public void remainder(int array[],int size){
        for(i=0;i<size-1;i++){
                        result=array[i]%array[i+1];
                        System.out.println(array[i]+" % "+array[i+1]+" = "+result);
                    }
    }
}
public class MenuDriven{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        Operations op=new Operations();
        int option,size,i;
        System.out.println("Enter the Size of the array");
        size=scan.nextInt();
        int array[]=new int[size];
        System.out.println("Input Array elements:");
        for(i=0;i<size;i++){
            array[i]=scan.nextInt();
        }
        while(true){
            System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Remainder 6.Exit");
            System.out.println("Enter your Option:");
            option=scan.nextInt();
            switch(option){
                case 1:
                    op.addition(array,size);
                    break;
                case 2:
                    op.subtraction(array,size);
                    break;
                case 3:
                    op.multiplication(array,size);
                    break;
                case 4:
                     op.division(array,size);
                     break;
                case 5:
                     op.remainder(array,size);
                     break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
            }
        }
    }