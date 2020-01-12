import java.lang.Math;

class NumberFunctions{
    public static void main(String args[]){
        double input1 = 10.098,input2=-20.598;
        int input3 = 5;
        Integer a = input3;
        double input4 = Math.PI;
        //max()
        System.out.println("maximum number: "+Math.max(input1,input2));
        //min()
        System.out.println("minimum number: "+Math.min(input1,input2));
        //squareroot()
        System.out.println("square root of input1: "+Math.sqrt(input1));
        //cuberoot()
        System.out.println("cube root of input1: "+Math.cbrt(input1));
        //log()
        System.out.println("log of input1: "+Math.log(input1));
        //pow()
        System.out.println("value of input1 power input2: "+Math.pow(input1,input3));
        //trignometric methods
        System.out.println("sin of input1: "+Math.sin(input1));
        System.out.println("cos of input1: "+Math.cos(input1));
        System.out.println("cos of input1: "+Math.cos(input1));
        //ulp()
        System.out.println("ulp of input1: "+Math.ulp(input3));
        //compareTo()
        System.out.println("when compared inputs are equal: "+a.compareTo(5));// 0
        System.out.println("when input is smaller than the argument: "+a.compareTo(6));// -1
        System.out.println("when input is greater than the argument: "+a.compareTo(4));// 1
        //equals()
        System.out.println("when both inputs are equal: "+a.equals(5));// true
        System.out.println("when both inputs are not equal: "+a.equals(6));// false
        //abs()
        System.out.println("absolute value for positive input: "+Math.abs(input1));
        //round()
        System.out.println("round off value for positive input: "+Math.round(input1));
        System.out.println("round off value for negative input: "+Math.round(input2));
        //random()
        System.out.println("random value: "+Math.random());
        //toString()
        System.out.println("to string: "+a.toString());
        //ceil()
        System.out.println("ceil of input: "+Math.ceil(input1));
        //floor()
        System.out.println("floor of input: "+Math.floor(input1));
        //signum()
        System.out.println("sign of positive input: "+Math.signum(input1));
        System.out.println("sign of negative input: "+Math.signum(input2));
        //copysign()-returns the first argument with the sign of the second argument
        System.out.println("copy method: "+Math.copySign(input1,input2));
        //getExponent()-returns unbiased exponent of the input
        System.out.println("exponent of input1: "+Math.getExponent(input1));
        //toDegrees()
        System.out.println("input4 into degrees: "+Math.toDegrees(input4));
        //toRadians()
        System.out.println("input1 into radians: "+Math.signum(input1));
        //parseInt()
        System.out.println("string to int: "+Integer.parseInt("24"));
        System.out.println("string to int with radix: "+Integer.parseInt("24",5));//numberformatexception occurs when the radix is <= any digits of first arguments(here 1,2,3,4)
        //parseFloat()
        System.out.println("string to float: "+Float.parseFloat("24"));
        //toOctalString()
        System.out.println("to octal: "+Integer.toOctalString(52));
        //Value()
        System.out.println("byte value of input: "+a.floatValue());
        System.out.println("byte value of input: "+a.longValue());
        System.out.println("byte value of input: "+a.shortValue());
        System.out.println("byte value of input: "+a.byteValue());
    }
}