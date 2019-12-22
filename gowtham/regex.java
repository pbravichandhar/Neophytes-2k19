// Java program to demonstrate working of splitting a text by a 
// given pattern 
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 

class Demo 
{ 
	public static void main(String args[]) 
	{ 
		String text = "geeks1for 2Keeks3";  
		String delimiter = "\\d"; 
		Pattern pattern = Pattern.compile(delimiter, 
										Pattern.CASE_INSENSITIVE); 
		String[] result = pattern.split(text); 
		for (String temp: result) 
            System.out.println(temp); 
            
            
	} 
} 
