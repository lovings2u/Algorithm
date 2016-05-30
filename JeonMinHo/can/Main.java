package can;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int black = sc.nextInt();
		int white = sc.nextInt();
		
		if(odd(black) && odd(white)) {
			System.out.println("white");
		} else if(even(black) && even(white)) {
			System.out.println("black");
		} else if(odd(black)) {
			System.out.println("black");
		} else if(odd(white)) {
			System.out.println("white");
		}

	}

	static boolean odd(int n) {
		return n % 2 == 1;
	}
	static boolean even(int n) {
		return n % 2 == 0;
	}
}
