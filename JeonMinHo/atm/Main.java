package atm;

import java.util.Scanner;

public class Main {
	static Scanner sc;
	static {
		sc = new Scanner(System.in);
	}
	public static void main(String[] args) {
		int a = sc.nextInt();
		double b = sc.nextDouble();
		
		if(b<a+0.5 || a%5 != 0) {
			System.out.printf("%.2f",b);
		} else 
			System.out.printf("%.2f",b-a-0.5);
	}
}
