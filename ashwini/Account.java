class Account
{
int a;
int b;

 public void setData(int c,int d){
  a = c;
  b = d;
 }
 public void showData(){
   System.out.println("Value of A ="+a);
   System.out.println("Value of B ="+b);
 }
 public static void main(String args[]){
   Account obj1 = new Account();
   Account obj2=new Account();
   obj1.setData(2,3);
   obj1.showData();
  obj2.setData(4,3);
   obj2.showData();
 }
}