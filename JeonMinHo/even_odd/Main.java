package even_odd;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(odd(a) && odd(b)) {
			System.out.println("odd+odd=even\nodd*odd=odd");
		} else if (even(a) && even(b)) {
			System.out.println("even+even=even\neven*even=even");
		} else if(odd(a) && even(b)) {
			System.out.println("odd+even=odd\nodd*even=even");
		} else if(even(a) && odd(b)) {
			System.out.println("even+odd=odd\neven*odd=even");
		}
	}
	
	static boolean even(int a) {
		return a%2==0;
	}
	static boolean odd(int a) {
		return a%2!=0;
	}
}
