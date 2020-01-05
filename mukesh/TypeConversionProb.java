public class TypeConversionProb{

     public static void main(String []args){
        int int1=10;
        long long1=int1;
        float float1=long1;
        System.out.println(int1+" "+long1+" "+float1);
        
        double D=100.04;
        long l=(long)D;
        int i=(int)l;
        System.out.print(D+" "+l+" "+i+" ");
        
        
     }
}