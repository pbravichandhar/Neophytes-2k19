import java.util.ArrayList;
import java.util.Scanner;

public class WrapperClass {
  public static void main(String []args)

  {
    // Converting Primitive Datatype into Object
    Integer[] a = new Integer[10];
    Scanner s = new Scanner(System.in);
    for (int i = 0; i < 10; i++) {
      a[i] = s.nextInt();
    }
    ArrayList<Integer> ShowList = new ArrayList<>();
    for (int item : a) {
      ShowList.add(item);
    }
    System.out.println(ShowList);
  }
}
