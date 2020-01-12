public class Throw1 {
   static void validate(int age) {
      if (age < 18)
         throw new ArithmeticException("not valid");
      else
         System.out.println("ok ");
   }

   public static void main(String args[]) {
      validate(13);
   }
}
