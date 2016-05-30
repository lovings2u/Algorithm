package divisor1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long start = sc.nextLong();
		long end = sc.nextLong();
		int count = 0;
		long result = 0;
		long rootStart = (long) Math.ceil(Math.sqrt(start));
		long rootEnd = (long) Math.floor(Math.sqrt(end));
		for(long i = rootStart; i <= rootEnd; i++) {
			count ++;
			result += (long)Math.pow(i, 2);
		}

		System.out.println(count + " " + result);
	}
}

