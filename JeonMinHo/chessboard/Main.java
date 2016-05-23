package chessboard;

import java.util.Scanner;

public class Main {
	private static int[] flag = { 1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int term = 1, x = 0, y = 0, t = 0;
		while (betweenFlag(n)) {
			flag[0] = flag[1];
			term += 2;
			flag[1] += term;
		}
		term = (term - 1) / 2;
		t = n - flag[0];
		if (odd(term)) {
			if (t > term + 1) {
				x = term + 1;
				y = 2 * (term + 1) - t;
			} else {
				x = t;
				y = term + 1;
			}
		} else {
			if (t > term + 1) {
				x = 2 * (term + 1) - t;
				y = term + 1;
			} else {
				x = term + 1;
				y = t;
			}
		}

		System.out.println(x + " " + y);

	}

	static boolean odd(int n) {
		return n % 2 == 1;
	}

	static boolean betweenFlag(int n) {
		return !(n >= flag[0] && n <= flag[1]);
	}
}
