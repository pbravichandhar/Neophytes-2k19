public class GFG { 
    static String extractInt(String str) 
    { 
       
        str = str.replaceAll("[^\\d]", " "); 
        str = str.trim();  
        str = str.replaceAll(" +", " "); 
        if (str.equals("")) 
            return "-1";
        return str; 
    } 
    public static void main(String[] args) 
    { 
        String str = "avbkjd1122klj4 543 af"; 
        System.out.print(extractInt(str)); 
    } 
} 