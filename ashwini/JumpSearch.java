import java.util.*;
public class JumpSearch 
{
	public static int SearchJump(int[] arr, int x) {
		int n = arr.length;
		int step = (int) Math.floor(Math.sqrt(n));
		int prev = 0;
		while (arr[Math.min(step, n) - 1] < x) {
			prev = step;
			step += (int) Math.floor(Math.sqrt(n));
			if (prev >= n)
				return -1;
		}
		while (arr[prev] < x) {
			prev++;
		    if (prev == Math.min(step, n))
			return -1;
		}
		if (arr[prev] == x)
			return prev;
		    return -1;
	}
	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 2, 3, 5, 9, 13, 21, 34, 55, 89, 145, 237, 377, 610 };
		int x = 55;
		int index = SearchJump(arr, x);
		if (x != -1)
			System.out.println("Number " + x + " is found at index " + index);
		else {
			System.out.println("Number " + x + " not found");
        }
    }

}


