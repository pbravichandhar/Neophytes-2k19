public class Main
{
    int  value1;
    int  value2;
     Main(){
       value1 = 10;
       value2 = 20;
       System.out.println("in the 1st Constructor");
     }
     Main(int a){
      value1 = a;
      System.out.println("in the 2nd Constructor");
    }
    Main(int a,int b){
    value1 = a;
    value2 = b;
    System.out.println("in the 3rd Constructor");
   }
    static void printt(int i)
    {
         System.out.println(i);
    }
    static void printt(float f, int i)  
    {
         System.out.println(i + " "+f);
    }
    public void display(){
      System.out.println("Value1  "+value1);
      System.out.println("Value2  "+value2);
  }
	public static void main(String[] args) {
		int i = 100;  
        long l = i;  
        float f = l;  
        System.out.println(i+" "+l+" "+f);
        double d = 100.04;  
        long l1 = (long)d; 
        i = (int)l1;  
        System.out.println(d+" "+l1+" "+i); 
        
        int [] arr={1,2,3,4,5,6,7,8,9};
        for(int vari:arr)
        {
            System.out.print(vari+" ");
        }
        int in=10;
        printt(i);
        printt(f,i);
        Main d1 = new Main();
        Main d2 = new Main(30);
        Main d3 = new Main(30,40);
        d1.display();
        d2.display();
        d3.display();
        
        
        
        
	}
}
