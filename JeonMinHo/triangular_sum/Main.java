package triangular_sum;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int end = sc.nextInt();
		int sum = 3;
		int result = 0;
		for(int i = 1, j = 3; i <= end; i++, j++) {
			result += i * sum;
			sum += j;
		}
		System.out.println(result);
	}
}
