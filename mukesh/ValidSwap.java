import java.util.*;

public class ValidSwap {
	public static void check() {
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length of Array");
		int len = sc.nextInt();
		String[] arr = new String[len];
		System.out.println("Enter the Array");
		for (int index1 = 0; index1 < len; index1++) {
			arr[index1] = sc.next();
		}
		System.out.println("Enter the String");
		String str = sc.next();
		int strlen = str.length();
		for (int index = 0; index < len; index++) {
			flag = 0;
			for (int index2 = 0; index2 < strlen; index2++) {
				for (int index3 = index2 + 1; index3 < strlen; index3++) {
					if (strlen != arr[index].length()) {
						flag = 0;
						break;
					}
					String str1 = arr[index];
					char[] ch = str1.toCharArray();
					char temp = ch[index2];
					ch[index2] = ch[index3];
					ch[index3] = temp;
					String chararr = new String(ch);
					if (str.equals(chararr)) {
						flag = 1;
						break;
					}
				}
				if (flag == 1) {
					break;
				}

			}
			if (flag == 1) {
				System.out.print("true,");
			} else {
				System.out.print("false,");
			}
		}
	}

	public static void main(String[] args) {
		check();

	}
}
