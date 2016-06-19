package insubunE;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		double x1 = (a + Math.sqrt(Math.pow(a, 2) - (4*b)))/2;
		double x2 = (a - Math.sqrt(Math.pow(a, 2) - (4*b)))/2;
		if(x1 % 1 != 0 || x2 % 1 != 0) {
			System.out.println("impossible");
		} else {
			System.out.printf("(x-%d)(x-%d)", x1>x2? (int)x2:(int)x1, x1>x2? (int)x1:(int)x2);
		}
	}
}
