package nsubset;

import java.util.Scanner;

public class Main {
	static Scanner sc;
	static {
		sc = new Scanner(System.in);
	}
	public static void main(String[] args) {
		
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		
		System.out.println((long)Math.pow(input2, input1));
		
	}
}
