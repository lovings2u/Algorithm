package d_f;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double input = sc.nextDouble();
		int d =  (int)Math.floor(input);
		System.out.printf("%d %.2f", d, round(input,d));
	}
	
	static double round(double a, int b) {
		return Math.round((a-b)*100)/100.0;
	}
}
