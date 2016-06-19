package beat;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int gap = sc.nextInt();
		
		int a = (sum + gap) / 2;
		int b = a - gap;

		if ((a < 0 || b < 0) || ((sum + gap)%2 != 0)) {
			System.out.println("impossible");
			return;
		}
		System.out.println(a + " " + b);
	}
}
