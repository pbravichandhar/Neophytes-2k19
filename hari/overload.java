import java.util.*;

class Overload {
    public static void main(String[] args) {
        Sample obj = new Sample();
        obj.mysample(); // example to call one function from another file
        char ch = 'D';
        int value = 10;
        tables.arrayfun(2, 3); // from table.java files
        overload.over(3); // simple example from sample file fun2
        overload.over(ch); // simple example from sample file fun2
        args1.args(value);
    }
}