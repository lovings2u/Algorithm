package flea;

import java.util.Scanner;

public class Main {
	private static int[] jumpResult = new int[2];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt(), 
			dx = sc.nextInt(), dy = sc.nextInt();
		jumpResult[0] = x;
		jumpResult[1] = y;
		int index = 0;
		if((onBlack(s)||onLine(s)) && (s == dx || s == dy)) {
			System.out.println("The flea cannot escape from black squares.");
			return;
		}
		while (onBlack(s) || onLine(s)) {
			index++;
			jumpResult[0] += dx;
			jumpResult[1] += dy;
		}
		if(jumpResult[0] < 0 || jumpResult[1] < 0) {
			System.out.println("The flea cannot escape from black squares.");
			return;
		}
		System.out.printf("After %d jumps the flea lands at (%d, %d).", index, jumpResult[0], jumpResult[1]);

	}

	static boolean onBlack(int s) {
		return (odd(jumpResult[0]/s) && odd(jumpResult[1]/s)) ||
				(even(jumpResult[0]/s) && even(jumpResult[1]/s));
	}
	static boolean even(int n) {
		return n % 2 == 0;
	}
	static boolean odd(int n) {
		return n % 2 == 1;
	}
	static boolean onLine(int n) {
		if(jumpResult[0]%n == 0 || jumpResult[1]%n == 0)
			return true;
		return false;
	}
}
