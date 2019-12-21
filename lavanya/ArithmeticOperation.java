import java.util.*;

class ArithmeticOperation {
  public static void main(String args[]) {
    int n, i;
    System.out.println("Enter the size:");
    Scanner inp = new Scanner(System.in);
    n = inp.nextInt();
    int a[] = new int[n];
    int add[] = new int[n - 1];
    int sub[] = new int[n - 1];
    int mul[] = new int[n - 1];
    int div[] = new int[n - 1];
    for (i = 0; i < n; i++) {
      a[i] = inp.nextInt();
    }
    for (i = 0; i < n; i++) {
      if (i != n - 1) {
        add[i] = a[i] + a[i + 1];
        sub[i] = a[i] - a[i + 1];
        mul[i] = a[i] * a[i + 1];
        div[i] = a[i] / a[i + 1];
        System.out.println(add[i]);
        System.out.println(sub[i]);
        System.out.println(mul[i]);
        System.out.println(div[i]);
      }
    }
  }
}
