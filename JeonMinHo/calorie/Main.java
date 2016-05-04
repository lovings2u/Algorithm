package calorie;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] b = {0, 461, 431, 420, 0};
		int[] d = {0, 130, 160, 118, 0};
		int[] s = {0, 100, 57, 70, 0};
		int[] de = {0, 167, 266, 75, 0};
		int[] a = {b[sc.nextInt()], d[sc.nextInt()], s[sc.nextInt()], de[sc.nextInt()]};
		System.out.printf("Your total Calorie count is %d.", a[0]+a[1]+a[2]+a[3]);
	}
}
