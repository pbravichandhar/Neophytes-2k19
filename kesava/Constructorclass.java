public class Constructorclass {

     int x;
    Constructorclass()
    {
      System.out.println("Constructor of the parent class!!");
    }

    Constructorclass(int x) {

        this.x=x;
        System.out.println("The parameterised constructor!!: "+x);
    }
    Constructorclass(String s)
    {
        System.out.println("The parameterised constructor Overloaded!! : "+s);

    }
    Constructorclass(Constructorclass c)
    {
      this("'this' func call");
      System.out.print("Copy Constructor call: ");
      int a=c.x;
      System.out.print(a);

    }
    public static void main(String[] args) {

        Constructorclass c1 = new Constructorclass();
        Constructorclass c2= new Constructorclass(5);
        Constructorclass c3= new Constructorclass("Sample");
        Constructorclass c4=new Constructorclass(c2);

    }
}

