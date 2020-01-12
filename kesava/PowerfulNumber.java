import java.util.Scanner;
public class PowerfulNumber {
    public static void main(String [] args) {
        try {
            Scanner s = new Scanner(System.in);
            int i = 2, Number, NoofPrimefactor = 0, NoPosPrimeFactor = 0;
            Number = s.nextInt();
            int Temp = Number;
            while (i < Temp) {
                while (Number % i == 0) {
                    Number /= i;
                    NoofPrimefactor += 1;

                    if (Temp % Math.pow(i, 2) == 0) {
                        NoPosPrimeFactor += 1;
                    }
                }
                i++;
            }
            if (NoofPrimefactor == NoPosPrimeFactor) {
                System.out.println("True");
            } if(NoofPrimefactor==0 && NoPosPrimeFactor==0) 
            {
                System.out.println("False");
            }
            else
            {
                System.out.println("False");
            }
        }
        catch (Exception err)
        {
           System.out.println(err+"\n"+"Enter A valid Integer");
        }
    }
}
