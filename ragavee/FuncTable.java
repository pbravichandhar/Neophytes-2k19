import java.util.*;

class FuncTable{
    public static void main(String args[]){
       Scanner obj=new Scanner(System.in);
       int table=obj.nextInt();
       int num=obj.nextInt();
       CustomClass obj1=new CustomClass(); 
       obj1.dispTable(table,num);
    }
}
class CustomClass{
    public void dispTable(int table,int num){
        for(int i=1;i<=num;i++){
            System.out.println(table+"*"+i+"="+table*i);
        }
    }
}