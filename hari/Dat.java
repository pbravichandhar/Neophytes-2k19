import java.time.*;
import java.util.Scanner;

public class Dat {
    rivate static int calculateMonthsFromBirthdate(Date date){
        int numberOfMonths = 0;
        Calendar currentDate = Calendar.getInstance();
        int year = 0; 
        int months = 0;
         
        if(date != null)
        {
              Calendar dateOfBirth = Calendar.getInstance();
              dateOfBirth.setTime(date);
              year = currentDate.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
              months = (currentDate.get(Calendar.MONTH)+1) - ((dateOfBirth.get(Calendar.MONTH) +1) );
                    if(currentDate.get(Calendar.DAY_OF_MONTH) < (dateOfBirth.get(Calendar.DAY_OF_MONTH)) )     
                    {
                          months--;
                    }
              numberOfMonths = months + (year * 12);
        }

        return numberOfMonths;

        }

}
