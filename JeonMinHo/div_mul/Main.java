package div_mul;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a == 0 || b % a != 0) 
			System.out.printf("%d !| %d", a,b);
		else
			System.out.printf("%d | %d", a,b);
	}
}
