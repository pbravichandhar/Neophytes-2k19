import java.util.*;

public class MonthBettDate {
	public static void check(int d1, int d2, int m1, int m2, int y1, int y2) {
		if (d1 <= 31 && d2 <= 31 && m1 < 13 && m2 < 13 && y1 <= 2019 && y2 <= 2019) {
			System.out.println("Wrong Input");
		}
	}

	public static int calculation(int d1, int d2, int m1, int m2, int y1, int y2) {
		int month = ((y2 - y1) * 12) + (12 - m1) + m2;
		return month;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Date/Month");
		int d1 = sc.nextInt();
		int m1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Enter the 2st Date/Month");
		int d2 = sc.nextInt();
		int m2 = sc.nextInt();
		int y2 = sc.nextInt();
		check(d1, d2, m1, m2, y1, y2);
		int ans = calculation(d1, d2, m1, m2, y1, y2);
		System.out.println(ans);

	}
}
