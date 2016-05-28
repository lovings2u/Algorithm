package pie;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] first = { sc.nextInt(), sc.nextInt() };
		int[] second = { sc.nextInt(), sc.nextInt() };
		
		long deno = lcm(first[1], second[1]);
		
		long num = (first[0] * deno/first[1]) + (second[0] * deno/second[1]);
		
		long result = deno - num;
		if(result == 0) {
			System.out.println(0);
			return;
		}
		int sep = gcd((int)result, (int)deno);
		if(sep != 1){
			result = result/sep;
			deno = deno/sep;
		}
		System.out.println(result + "/" + deno);
		
	}

	static long lcm(long a, long b) {
		int gcd_value = gcd((int) a, (int) b);
		if (gcd_value == 0)
			return 0;
		return Math.abs((a * b) / gcd_value);
	}

	static int gcd(int a, int b) {
		while (b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return Math.abs(a);
	}
}
