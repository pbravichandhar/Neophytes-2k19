enum Student
{
    dhoni(11), sachin(10), virat(13), yuvraj(9);
    private int age;                   //variable defined in enum Student
    int getage()
    {
     return age;
    }                                   //method defined in enum Student
 Student(int age)                       //constructor defined in enum Student
   {
    this.age= age;
   }
   protected String fun()     
    {
        String message = "i am " + this + "";
        System.out.println( message );
        return message;
    }
   
}

class Enum1
{
    public static void main( String args[] )
 {
    Student S;
    System.out.println("Age of yuvraj is " +Student.valueOf("yuvraj").getage()+ "years");
    Student.sachin.fun();
 }
}
