
// String matching in Java 
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 

class Demo1
{ 
	public static void main(String args[]) 
	{ 
		System.out.println (Pattern.matches("regularexpres*ion","regularexpressssssion")); 
                                            // * holds the value of 0 or more times

		System.out.println (Pattern.matches("reggularr", 
											"regular")); 


		Pattern pattern = Pattern.compile("r*"); 

		 
		Matcher m = pattern.matcher("regularexpression"); 

		 
		while (m.find()) 
			System.out.println("Pattern found from " + m.start() + 
							" to " + (m.end()-1)); 
	} 
} 
