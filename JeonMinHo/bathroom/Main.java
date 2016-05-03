package bathroom;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		System.out.println(getResult(a,2.0) + " " + getResult(a, 3.0));
	}
	
	static int getResult(int a, double b) {
		return (int)Math.ceil(a/b);
	}
}
