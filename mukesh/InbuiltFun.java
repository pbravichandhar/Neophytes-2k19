import java.util.*;
public class InbuiltFun
{
    public static void main(final String[] args) {
        final int []Array={10,0,30,490,50,32,21,10};
        final int []Array1={10,3,32,4,50,32,21,10};

        final int [][]arr1={{1,2}};
        final int [][]arr2={{1,2}};

        final int keyy=32;
        Arrays.fill(Array, keyy);
        Arrays.parallelSort(Array1);               //Array parallel sorting.
        Arrays.sort(Array);                       //Array Sorting.
        Arrays.sort(Array,1,4);
        System.out.println("Array Length :"+Array.length);
        System.out.println("Array as string :"+Arrays.toString(Array));
        System.out.println(keyy+ " is in index of "+Arrays.binarySearch(Array, keyy));      
        System.out.println(keyy+ " is in index of "+Arrays.binarySearch(Array,1,3, keyy));
        System.out.println("Array Comparison:"+Arrays.compare(Array,Array1));
        System.out.println("Array Unsigned int comparison: "+ Arrays.compareUnsigned(Array, Array1)); 
        System.out.println("New copy of Array: "+Arrays.toString(Arrays.copyOf(Array, 10)));
        System.out.println("New copy of Array in range: "+Arrays.toString(Arrays.copyOfRange(Array, 1, 9)));
        System.out.println("Array deepEqual: "+Arrays.deepEquals(arr1, arr2));
        System.out.println("Array HasCode: "+Arrays.deepHashCode(arr1));
        System.out.println("Array DeepToString:"+Arrays.deepToString(arr1));
        System.out.println("Array Equal: "+Arrays.equals(Array, Array1));
        System.out.println("Array String: "+Arrays.toString(Array));
        System.out.println("Array Mismatch:"+Arrays.mismatch(Array,Array1));
        System.out.println(Arrays.stream(Array));
        System.out.println(Arrays.spliterator(Array));
        System.out.println(Arrays.spliterator(Array,1,4));
        //setAll(Array,10);
        //System.out.println("Array as string :"+Arrays.toString(Array));



        







        
    }
}