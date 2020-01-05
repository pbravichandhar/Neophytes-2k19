import java.util.*;

class Tables{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int number=obj.nextInt();
        for(int i=1;i<=number;i++){
          for(int j=1;j<=number;j++){
              System.out.println(i+"*"+j+"="+i*j);
          }
        }
    }
}
